package com.github.iamdual;

import com.github.iamdual.exceptions.UnsupportedTldException;
import com.github.iamdual.parser.Parser;
import com.github.iamdual.parser.Result;
import com.github.iamdual.templates.Template;
import com.github.iamdual.templates.TemplateFactory;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UpdatedDateTest extends Data {

    @Test
    void validateUpdatedDate() throws UnsupportedTldException, IOException, IllegalAccessException {
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
