package com.github.iamdual;

import com.github.iamdual.parser.Result;
import org.junit.Test;

public class LiveTest {

    @Test
    public void live() throws Exception {
        WhoisParser whoisParser = new WhoisParser();
        whoisParser.setDomain("google.com");
        Result result = whoisParser.lookup();
        System.out.println(result.getWhoisResponse().length());
        System.out.println(result.getAvailable());
        System.out.println(result.getExpiryDate());
        System.out.println(result.getUpdateDate());
    }
}