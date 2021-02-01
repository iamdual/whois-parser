package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .de TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotDe extends DefaultTemplate {

    @Override
    public String getWhoisServer() {
        return "whois.denic.de";
    }

    @Override
    public String getRegexAvailable() {
        return "Status: free$";
    }

    @Override
    public String getRegexExpiryDate() {
        // No expiry date section
        return null;
    }

    @Override
    public String getFormatExpiryDate() {
        return null;
    }

    @Override
    public String getRegexUpdatedDate() {
        // Changed: 2019-09-24T20:06:12+02:00
        return "Changed: ([0-9A-Z\\-+:]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd'T'HH:mm:ssXXX";
    }
}
