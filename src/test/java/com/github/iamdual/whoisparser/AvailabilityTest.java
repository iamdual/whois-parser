package com.github.iamdual.whoisparser;

import com.github.iamdual.whoisparser.exceptions.InvalidDomainException;
import com.github.iamdual.whoisparser.exceptions.UnsupportedTldException;
import com.github.iamdual.whoisparser.parser.Parser;
import com.github.iamdual.whoisparser.parser.Result;
import com.github.iamdual.whoisparser.templates.Template;
import com.github.iamdual.whoisparser.templates.TemplateFactory;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AvailabilityTest extends Data {

    @Test
    void domainIsNotAvailable() throws UnsupportedTldException, IllegalAccessException {
        for (String tld : cached.keySet()) {
            System.out.println("-> domainIsNotAvailable has started for " + tld + "..");
            String whoisResponse = cached.get(tld);
            TemplateFactory templateFactory = new TemplateFactory();
            Template template = templateFactory.getTemplate(tld);
            Parser parser = new Parser(template, whoisResponse);
            Result result = parser.getResult();
            assertFalse(result.getAvailable());
        }
    }

    @Test
    void domainIsAvailable() throws UnsupportedTldException, IOException, InvalidDomainException, InterruptedException, IllegalAccessException {
        Thread.sleep(2000);

        for (String tld : cached.keySet()) {
            System.out.println("-> domainIsAvailable has started for " + tld + "..");
            WhoisParser whoisParser = new WhoisParser("shouldnotexists0248." + aProperExtension(tld), Parser.AVAILABILITY);
            Result result = whoisParser.lookup();
            assertTrue(result.getAvailable());
            assertNull(result.getExpiryDate());
            assertNull(result.getUpdatedDate());
        }
    }
}
