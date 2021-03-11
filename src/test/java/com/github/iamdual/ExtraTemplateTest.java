package com.github.iamdual;

import com.github.iamdual.exceptions.InvalidAdapterException;
import com.github.iamdual.exceptions.InvalidDomainException;
import com.github.iamdual.exceptions.UnsupportedTldException;
import com.github.iamdual.parser.Result;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ExtraTemplateTest {

    @Test
    void expectedResult() throws UnsupportedTldException, IllegalAccessException, InvalidDomainException, InvalidAdapterException, IOException {
        WhoisParser whoisParser = new WhoisParser("hello.ekin");
        whoisParser.setExtraTemplates(ExtraTemplate.getTemplates());
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
    void domainIsAvailable() throws UnsupportedTldException, IllegalAccessException, InvalidDomainException, InvalidAdapterException, IOException {
        WhoisParser whoisParser = new WhoisParser("shouldnotexists0248.ekin");
        whoisParser.setExtraTemplates(ExtraTemplate.getTemplates());
        Result result = whoisParser.lookup();
        assertTrue(result.getAvailable());
        assertNull(result.getExpiryDate());
        assertNull(result.getUpdatedDate());
    }
}
