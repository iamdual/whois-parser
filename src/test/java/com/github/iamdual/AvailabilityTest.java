package com.github.iamdual;

import com.github.iamdual.exceptions.InvalidAdapterException;
import com.github.iamdual.exceptions.InvalidDomainException;
import com.github.iamdual.exceptions.UnsupportedTldException;
import com.github.iamdual.parser.Parser;
import com.github.iamdual.parser.Result;
import com.github.iamdual.templates.Template;
import com.github.iamdual.templates.TemplateFactory;
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
    void domainIsAvailable() throws UnsupportedTldException, InvalidAdapterException, IOException, InvalidDomainException, InterruptedException, IllegalAccessException {
        Thread.sleep(2000);

        for (String tld : cached.keySet()) {
            System.out.println("-> domainIsAvailable has started for " + tld + "..");
            WhoisParser whoisParser = new WhoisParser("shouldnotexists0248." + aProperExtension(tld), Parser.FLAG_AVAILABILITY);
            Result result = whoisParser.lookup();
            assertTrue(result.getAvailable());
            assertNull(result.getExpiryDate());
            assertNull(result.getUpdatedDate());
        }
    }
}
