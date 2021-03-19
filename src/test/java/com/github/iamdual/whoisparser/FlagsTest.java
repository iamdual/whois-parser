package com.github.iamdual.whoisparser;

import com.github.iamdual.whoisparser.exceptions.UnsupportedTldException;
import com.github.iamdual.whoisparser.parser.Parser;
import com.github.iamdual.whoisparser.parser.Result;
import com.github.iamdual.whoisparser.templates.Template;
import com.github.iamdual.whoisparser.templates.TemplateFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class FlagsTest extends Data {

    @Test
    void validateFlags1() throws UnsupportedTldException, IllegalAccessException {
        for (String tld : cached.keySet()) {
            System.out.println("-> validateFlags1 has started for " + tld + "..");
            String whoisResponse = cached.get(tld);
            TemplateFactory templateFactory = new TemplateFactory();
            Template template = templateFactory.getTemplate(tld);
            if (template.getRegexExpiryDate() == null || template.getRegexUpdatedDate() == null || template.getRegexAvailable() == null) {
                continue;
            }
            Parser parser = new Parser(template, whoisResponse, Parser.AVAILABILITY);
            Result result = parser.getResult();
            assertNotNull(result.getAvailable());
            assertNull(result.getExpiryDate());
            assertNull(result.getUpdatedDate());
        }
    }

    @Test
    void validateFlags2() throws UnsupportedTldException, IllegalAccessException {
        for (String tld : cached.keySet()) {
            System.out.println("-> validateFlags2 has started for " + tld + "..");
            String whoisResponse = cached.get(tld);
            TemplateFactory templateFactory = new TemplateFactory();
            Template template = templateFactory.getTemplate(tld);
            if (template.getRegexExpiryDate() == null || template.getRegexUpdatedDate() == null || template.getRegexAvailable() == null) {
                continue;
            }
            Parser parser = new Parser(template, whoisResponse, Parser.UPDATED_DATE | Parser.EXPIRY_DATE);
            Result result = parser.getResult();
            assertNull(result.getAvailable());
            assertNotNull(result.getExpiryDate());
            assertNotNull(result.getUpdatedDate());
        }
    }
}
