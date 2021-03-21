package com.github.iamdual.whoisparser;

import com.github.iamdual.whoisparser.adapter.Adapter;
import com.github.iamdual.whoisparser.adapter.AdapterFactory;
import com.github.iamdual.whoisparser.exceptions.UnsupportedTldException;
import com.github.iamdual.whoisparser.templates.Template;
import com.github.iamdual.whoisparser.templates.TemplateFactory;

import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

abstract class Data {

    static final Map<String, String> cached = new HashMap<>();

    // Some domain registrys are blocking requests due so many WHOIS requests, or may restrict to access the information
    // and it is causes tests fail. Exclusions also prevent to send extra requests for the same template with the same server.
    // Enter class names.
    static final String[] exclusions = {
            "Donuts", "Google", "CentralNic", "Uniregistry", "MMX", "FamousFourMedia", "XYZCOM",
            "DotShop", "DotCat", "DotAi", "DotCz", "DotTh", "DotTr", "DotPw", "DotId", "DotPt", "DotIr"
    };

    static final String[] additionalTlds = {
            "center", "company", "services", // Donuts
            "app", "dev", "how", // Google
            "online", "website", "fun", // CentralNic
            "click", "gift", "link", // Uniregistry
            "bayern", "garden", "work", // MMX
            "bid", "party", "science", // FamousFourMedia
            "beauty", "college", "xyz" // XYZCOM
    };

    static {
        TemplateFactory templateFactory = new TemplateFactory();
        Set<String> tldList = new TreeSet<>();
        boolean singleTest = false;

        if (System.getProperty("tld") != null) {
            singleTest = true;
            tldList.add(System.getProperty("tld"));
        } else {
            tldList.addAll(templateFactory.getTemplates().keySet());
            Set<String> listToRemove = new HashSet<>();
            for (String tld : tldList) {
                try {
                    String templateClass = templateFactory.getTemplate(tld).getClass().getSimpleName();
                    if (Arrays.asList(exclusions).contains(templateClass)) {
                        listToRemove.add(tld);
                    }
                } catch (UnsupportedTldException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            tldList.removeAll(listToRemove);
            tldList.addAll(Arrays.asList(additionalTlds));
        }

        for (String tld : tldList) {
            System.out.println("-> Caching has started for " + tld + "..");
            try {
                Template template = templateFactory.getTemplate(tld);
                AdapterFactory adapterFactory = new AdapterFactory();
                Adapter adapter = adapterFactory.getAdapter(template);
                adapter.setDomain(aProperDomain(tld, template), tld);
                cached.put(tld, adapter.getWhoisResponse());
                assertNotNull(adapter.getWhoisResponse());
                assertTrue(adapter.getWhoisResponse().length() > 0);
            } catch (UnsupportedTldException | IOException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        if (singleTest) {
            assertTrue(cached.containsKey(System.getProperty("tld")));
        }
    }

    static String anAvailableName(String tld, Template template) {
        switch (tld) {
            case "partners":
            case "social":
            case "market":
                return "london";
            case "ekin": // using for the tests
                return "hello";
            case "int":
                return "who";
        }

        switch (template.getClass().getSimpleName()) {
            case "Donuts":
            case "Uniregistry":
                return "hello";
        }

        return "google";
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

    static String aProperDomain(String tld, Template template) {
        return anAvailableName(tld, template) + "." + aProperExtension(tld);
    }
}
