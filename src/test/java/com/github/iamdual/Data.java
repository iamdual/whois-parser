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

    // Some domain registrars are blocking requests due so many WHOIS requests, or may restrict to access the information
    // and it is causes tests fail. Exclusions also prevent to send extra requests for the same template with the same server.
    // Please note that these extensions should be test manually at regular intervals.
    static final String[] exclusions = {
            "clothing", "company", "digital", "market", "media", "news", "online", "services", "shoes", "services", "zone",
            "center", "community", "mobi", "pro", "how", "new", "soy", "life", "travel", "shop", "website", "lol", "click",
            "help", "hosting", "group", "partners", "rocks", "solutions", "today", "cat", "domains", "technology", "expert",
            "cool", "ninja", "chat", "moda", "style", "watch", "boutique", "pub", "cafe", "coffee", "email", "social",
            "bz", "sc", "vc", "ai", "cz", "th", "tr", "pw"
    };

    static boolean singleTest = false;

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
            } catch (UnsupportedTldException | InvalidAdapterException | IOException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        if (singleTest) {
            assertTrue(cached.containsKey(System.getProperty("tld")));
        }
    }

    static String anAvailableName(String tld) {
        // Some domain names are restricted for registration.
        switch (tld) {
            case "boutique":
            case "cafe":
            case "capital":
            case "center":
            case "chat":
            case "click":
            case "clothing":
            case "coffee":
            case "community":
            case "company":
            case "cool":
            case "digital":
            case "domains":
            case "email":
            case "expert":
            case "gift":
            case "group":
            case "guru":
            case "help":
            case "hosting":
            case "life":
            case "link":
            case "live":
            case "lol":
            case "media":
            case "moda":
            case "news":
            case "ninja":
            case "pub":
            case "rocks":
            case "services":
            case "shoes":
            case "solutions":
            case "style":
            case "technology":
            case "today":
            case "watch":
            case "zone":
            case "ekin": // for tests
                return "hello";
            case "partners":
            case "social":
                return "london";
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
