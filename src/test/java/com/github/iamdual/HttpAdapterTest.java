package com.github.iamdual;

import com.github.iamdual.adapter.Adapter;
import com.github.iamdual.adapter.AdapterFactory;
import com.github.iamdual.exceptions.InvalidAdapterException;
import com.github.iamdual.exceptions.InvalidDomainException;
import com.github.iamdual.exceptions.UnsupportedTldException;
import com.github.iamdual.parser.Parser;
import com.github.iamdual.parser.Result;
import com.github.iamdual.templates.DefaultTemplate;
import com.github.iamdual.templates.Template;
import com.github.iamdual.templates.TemplateFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class HttpAdapterTest {

    @Test
    void jsonPost() throws UnsupportedTldException, IOException, InvalidAdapterException, InvalidDomainException {
        String testDomain = "whois-parser.test";

        TemplateFactory templateFactory = new TemplateFactory();
        templateFactory.registerTemplate("test", new JsonPostTemplate());
        AdapterFactory adapterFactory = new AdapterFactory();
        Template template = templateFactory.getTemplate(Utils.getDomainTld(testDomain));
        Adapter adapter = adapterFactory.getAdapter(template);
        adapter.setDomain(testDomain);
        Parser parser = new Parser(template, adapter.getWhoisResponse());
        Result result = parser.getResult();
        Assertions.assertNotNull(result.getWhoisResponse());
        Assertions.assertEquals(result.getWhoisResponse().charAt(0), '{');
    }

    private static class JsonPostTemplate extends DefaultTemplate {
        @Override
        public Adapter.Type getAdapterType() {
            return Adapter.Type.HTTP;
        }

        @Override
        public String getWhoisAddress() {
            return "https://httpbin.org/post";
        }

        @Override
        public String getQueryFormat() {
            return "{\"domain\":\"%s\"}";
        }

        @Override
        public String getHTTPMethod() {
            return "POST";
        }

        @Override
        public String getHTTPContentType() {
            return "application/json";
        }

    }
}