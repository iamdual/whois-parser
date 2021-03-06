package com.github.iamdual.whoisparser;

import com.github.iamdual.whoisparser.exceptions.UnsupportedTldException;
import com.github.iamdual.whoisparser.parser.Parser;
import com.github.iamdual.whoisparser.parser.Result;
import com.github.iamdual.whoisparser.templates.Template;
import com.github.iamdual.whoisparser.templates.TemplateFactory;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UpdatedDateTest extends Data {

    @Test
    void validateUpdatedDate() throws UnsupportedTldException, IllegalAccessException {
        for (String tld : cached.keySet()) {
            System.out.println("-> validateUpdatedDate has started for " + tld + "..");
            String whoisResponse = cached.get(tld);
            TemplateFactory templateFactory = new TemplateFactory();
            Template template = templateFactory.getTemplate(tld);
            if (template.getRegexUpdatedDate() == null) {
                continue;
            }
            Parser parser = new Parser(template, whoisResponse);
            Result result = parser.getResult();
            assertNotNull(result.getUpdatedDate());
            assertTrue(result.getUpdatedDate().getTime() <= new Date().getTime());
        }
    }
}
