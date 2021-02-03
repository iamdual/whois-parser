package com.github.iamdual;

import com.github.iamdual.parser.Result;
import org.junit.Test;

public class LiveTest {

    @Test
    public void getWhois() {
        try {
            WhoisParser whoisParser = new WhoisParser("google.de");
            Result result = whoisParser.lookup();
            System.out.println(result.getWhoisResponse());
            System.out.println(result.getUpdatedDate());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}