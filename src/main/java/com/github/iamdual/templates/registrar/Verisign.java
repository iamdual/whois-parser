package com.github.iamdual.templates.registrar;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of Verisign registrar.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class Verisign extends DefaultTemplate {
    @Override
    public String getWhoisServer() {
        return "whois.verisign-grs.com";
    }

    @Override
    public String getRegexAvailable() {
        return "^No match for \"";
    }

    @Override
    public String getRegexExpiryDate() {
        return "Registry Expiry Date: ([0-9A-Z\\-:]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd'T'HH:mm:ss'Z'";
    }

    @Override
    public String getRegexUpdateDate() {
        return "Updated Date: ([0-9A-Z\\-:]+)";
    }

    @Override
    public String getFormatUpdateDate() {
        return "yyyy-MM-dd'T'HH:mm:ss'Z'";
    }
}
