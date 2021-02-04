package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .name TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotName extends DefaultTemplate {

    @Override
    public String getWhoisServer() {
        return "whois.nic.name";
    }

    @Override
    public String getQueryFormat() {
        return "domain=%s";
    }

    @Override
    public String getRegexAvailable() {
        return "No match for domain \".+";
    }

    @Override
    public String getRegexExpiryDate() {
        // Expires On: 2022-01-14T16:58:23Z
        return "Expires On: ([0-9A-Z\\-:]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd'T'HH:mm:ss'Z'";
    }

    @Override
    public String getRegexUpdatedDate() {
        // Updated On: 2020-12-11T07:55:34Z
        return "Updated On: ([0-9A-Z\\-:]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd'T'HH:mm:ss'Z'";
    }
}
