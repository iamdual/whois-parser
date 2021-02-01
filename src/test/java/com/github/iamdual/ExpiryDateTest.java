package com.github.iamdual;

import com.github.iamdual.parser.Result;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ExpiryDateTest {

    @Test
    public void notNull() throws Exception {
        for (String tld : Data.DomainExtensions) {
            try {
                WhoisParser whoisParser = new WhoisParser();
                whoisParser.setDomain("google." + tld);
                Result result = whoisParser.lookup();
                assertNotNull(result.getExpiryDate());
            } catch (Exception e) {
                System.out.println("Error occurred on " + tld);
                e.printStackTrace();
            }
        }
    }
}