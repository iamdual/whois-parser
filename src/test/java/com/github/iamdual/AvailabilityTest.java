package com.github.iamdual;

import com.github.iamdual.parser.Result;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AvailabilityTest {

    @Test
    public void domainIsNotAvailable() throws Exception {
        for (String tld : Data.supportedTLDs) {
            WhoisParser whoisParser = new WhoisParser();
            whoisParser.setDomain("google." + tld);
            Result result = whoisParser.lookup();
            assertFalse(result.getAvailable());
        }
    }

    @Test
    public void domainIsAvailable() throws Exception {
        for (String tld : Data.supportedTLDs) {
            WhoisParser whoisParser = new WhoisParser();
            whoisParser.setDomain("shouldnotexists0248." + tld);
            Result result = whoisParser.lookup();
            assertTrue(result.getAvailable());
        }
    }
}