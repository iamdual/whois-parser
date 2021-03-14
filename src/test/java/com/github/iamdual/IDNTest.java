package com.github.iamdual;

import com.github.iamdual.exceptions.InvalidDomainException;
import com.github.iamdual.exceptions.UnsupportedTldException;
import com.github.iamdual.parser.Result;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class IDNTest {
    @Test
    void idnDomain() throws UnsupportedTldException, IllegalAccessException, InvalidDomainException, IOException {
        WhoisParser whoisParser = new WhoisParser("こんにちは.com");
        assertEquals("xn--28j2a3ar1p.com", whoisParser.getDomainIdn());
        Result result = whoisParser.lookup();
        assertNotNull(result.getWhoisResponse());
        assertNotNull(result.getExpiryDate());
        assertNotNull(result.getUpdatedDate());
        assertNotNull(result.getAvailable());
        assertFalse(result.getAvailable());
        assertTrue(result.getExpiryDate().getTime() > new Date().getTime());
        assertTrue(result.getUpdatedDate().getTime() <= new Date().getTime());
    }

    @Test
    void emojiDomain() throws UnsupportedTldException, IllegalAccessException, InvalidDomainException, IOException {
        WhoisParser whoisParser = new WhoisParser("\uD83D\uDE00.fm");
        assertEquals("xn--e28h.fm", whoisParser.getDomainIdn());
        Result result = whoisParser.lookup();
        assertNotNull(result.getWhoisResponse());
        assertNotNull(result.getExpiryDate());
        assertNotNull(result.getUpdatedDate());
        assertNotNull(result.getAvailable());
        assertFalse(result.getAvailable());
        assertTrue(result.getExpiryDate().getTime() > new Date().getTime());
        assertTrue(result.getUpdatedDate().getTime() <= new Date().getTime());
    }
}
