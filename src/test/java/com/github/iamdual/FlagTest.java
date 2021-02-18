package com.github.iamdual;

import com.github.iamdual.exceptions.UnsupportedTldException;
import com.github.iamdual.parser.Parser;
import com.github.iamdual.parser.Result;
import com.github.iamdual.templates.Template;
import com.github.iamdual.templates.TemplateFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class FlagTest extends Data {

    @Test
    void validateFlag() throws UnsupportedTldException {
        for (String tld : cached.keySet()) {
            System.out.println("-> validateFlag has started for " + tld + "..");
            String whoisResponse = cached.get(tld);
            TemplateFactory templateFactory = new TemplateFactory();
            Template template = templateFactory.getTemplate(tld);
            if (template.getRegexExpiryDate() == null || template.getRegexUpdatedDate() == null || template.getRegexAvailable() == null) {
                continue;
            }
            Parser parser = new Parser(template, whoisResponse, Parser.FLAG_UPDATED_DATE);
            Result result = parser.getResult();
            assertNull(result.getAvailable());
            assertNull(result.getExpiryDate());
            assertNotNull(result.getUpdatedDate());
        }
    }
}
