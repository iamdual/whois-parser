package com.github.iamdual;

import com.github.iamdual.adapter.Adapter;
import com.github.iamdual.adapter.AdapterFactory;
import com.github.iamdual.exceptions.InvalidAdapterException;
import com.github.iamdual.exceptions.UnsupportedTldException;
import com.github.iamdual.templates.Template;
import com.github.iamdual.templates.TemplateFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNotNull;

abstract class Data {

    public static final Map<String, String> cached = new HashMap<>();

    // Some domain registrars are blocks requests due so many requests and it causes tests fail.
    public static final String[] exceptions = {"market", "media", "services", "shoes", "clothes", "tr"};

    static {
        TemplateFactory templateFactory = new TemplateFactory();
        for (String tld : templateFactory.getTemplates().keySet()) {
            if (Arrays.asList(exceptions).contains(tld)) {
                continue;
            }
            System.out.println("-> Caching has started for " + tld);
            try {
                Template template = templateFactory.getTemplate(tld);
                AdapterFactory adapterFactory = new AdapterFactory();
                Adapter adapter = adapterFactory.getAdapter(template);
                adapter.setDomain(aProperDomain(tld));
                cached.put(tld, adapter.getWhoisResponse());
                assertNotNull(adapter.getWhoisResponse());
            } catch (UnsupportedTldException | InvalidAdapterException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    static String anAvailableName(String tld) {
        // Some domain names are restricted for register.
        switch (tld) {
            case "cz":
            case "capital":
            case "clothing":
            case "company":
            case "digital":
            case "guru":
            case "media":
            case "news":
            case "services":
            case "shoes":
            case "zone":
                return "hello";
            default:
                return "google";
        }
    }

    static String aProperExtension(String tld) {
        switch (tld) {
            case "uk":
                tld = "co.uk";
                break;
            case "il":
                tld = "co.il";
                break;
            case "tr":
                tld = "com.tr";
                break;
        }
        return tld;
    }

    static String aProperDomain(String tld) {
        return anAvailableName(tld) + "." + aProperExtension(tld);
    }
}
