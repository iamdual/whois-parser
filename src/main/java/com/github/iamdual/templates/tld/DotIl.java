package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .il TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotIl extends DefaultTemplate {
    @Override
    public String getWhoisServer() {
        return "whois.isoc.org.il";
    }

    @Override
    public String getRegexAvailable() {
        return "No data was found to match the request criteria\\.";
    }

    @Override
    public String getRegexExpiryDate() {
        // validity:  19-11-2021
        return "validity:[\\t ]+([0-9\\-]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "dd-MM-yyyy";
    }

    @Override
    public String getRegexUpdatedDate() {
        // No updated date section.
        return null;
    }

    @Override
    public String getFormatUpdatedDate() {
        return null;
    }
}
