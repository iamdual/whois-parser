package com.github.iamdual.whoisparser;

import com.github.iamdual.whoisparser.exceptions.InvalidDomainException;
import com.github.iamdual.whoisparser.exceptions.UnsupportedTldException;
import com.github.iamdual.whoisparser.parser.Result;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ExtraTemplateTest {

    @Test
    void expectedResult() throws UnsupportedTldException, IllegalAccessException, InvalidDomainException, IOException {
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
    void domainIsAvailable() throws UnsupportedTldException, IllegalAccessException, InvalidDomainException, IOException {
        WhoisParser whoisParser = new WhoisParser("shouldnotexists0248.ekin");
        whoisParser.setExtraTemplates(ExtraTemplate.getTemplates());
        Result result = whoisParser.lookup();
        assertTrue(result.getAvailable());
        assertNull(result.getExpiryDate());
        assertNull(result.getUpdatedDate());
    }
}
