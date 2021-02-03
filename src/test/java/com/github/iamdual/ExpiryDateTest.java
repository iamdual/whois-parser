package com.github.iamdual;

import com.github.iamdual.parser.Result;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ExpiryDateTest {

    @Test
    public void notNull() {
        for (String tld : Data.DomainExtensions) {
            try {
                WhoisParser whoisParser = new WhoisParser("google." + tld);
                Result result = whoisParser.lookup();
                assertNotNull(result.getExpiryDate());
                assertTrue(result.getExpiryDate().getTime() > new Date().getTime());
            } catch (Exception e) {
                System.out.println("Error occurred on " + tld);
                e.printStackTrace();
            }
        }
    }
}