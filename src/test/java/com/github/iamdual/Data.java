package com.github.iamdual;

import com.github.iamdual.adapter.Adapter;
import com.github.iamdual.adapter.AdapterFactory;
import com.github.iamdual.exceptions.InvalidAdapterException;
import com.github.iamdual.exceptions.UnsupportedTldException;
import com.github.iamdual.templates.Template;
import com.github.iamdual.templates.TemplateFactory;

import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

abstract class Data {

    static final Map<String, String> cached = new HashMap<>();

    // Some domain registrars are blocks requests due so many requests and it causes tests fail.
    // It's also prevent sending extra requests for the same template with the same servers.
    static final String[] exclusions = {
            "clothing", "company", "digital", "market", "media", "news", "online", "services", "shoes", "services", "zone",
            "mobi", "pro", "how", "new", "soy", "life", "travel", "shop", "website", "ai", "cz", "tr"
    };

    static Boolean singleTest = false;

    static {
        TemplateFactory templateFactory = new TemplateFactory();
        Set<String> tldList;

        if (System.getProperty("tld") != null) {
            singleTest = true;
            tldList = Collections.singleton(System.getProperty("tld"));
        } else {
            tldList = templateFactory.getTemplates().keySet();
        }

        for (String tld : tldList) {
            if (!singleTest && Arrays.asList(exclusions).contains(tld)) {
                continue;
            }
            System.out.println("-> Caching has started for " + tld + "..");
            try {
                Template template = templateFactory.getTemplate(tld);
                AdapterFactory adapterFactory = new AdapterFactory();
                Adapter adapter = adapterFactory.getAdapter(template);
                adapter.setDomain(aProperDomain(tld));
                cached.put(tld, adapter.getWhoisResponse());
                assertNotNull(adapter.getWhoisResponse());
                assertTrue(adapter.getWhoisResponse().length() > 0);
            } catch (UnsupportedTldException | InvalidAdapterException | IOException e) {
                e.printStackTrace();
            }
        }

        if (singleTest) {
            assertTrue(cached.containsKey(System.getProperty("tld")));
        }
    }

    static String anAvailableName(String tld) {
        // Some domain names are restricted for register.
        switch (tld) {
            case "capital":
            case "clothing":
            case "company":
            case "digital":
            case "guru":
            case "life":
            case "live":
            case "media":
            case "news":
            case "services":
            case "shoes":
            case "zone":
                return "hello";
            case "int":
                return "nato";
            default:
                return "google";
        }
    }

    static String aProperExtension(String tld) {
        switch (tld) {
            case "au":
                return "com.au";
            case "br":
                return "com.br";
            case "il":
                return "co.il";
            case "nz":
                return "co.nz";
            case "th":
                return "co.th";
            case "tr":
                return "com.tr";
            case "uk":
                return "co.uk";
            default:
                return tld;
        }
    }

    static String aProperDomain(String tld) {
        return anAvailableName(tld) + "." + aProperExtension(tld);
    }
}
