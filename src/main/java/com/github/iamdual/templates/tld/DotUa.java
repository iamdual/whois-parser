package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .ua TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotUa extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.ua";
    }

    @Override
    public String getRegexAvailable() {
        return "% No entries found for";
    }

    @Override
    public String getRegexExpiryDate() {
        // expires:  2021-07-21 18:03:50+03
        return "expires:[\\t ]+([0-9\\-:\\+ ]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd HH:mm:ssX";
    }

    @Override
    public String getRegexUpdatedDate() {
        // modified:  2020-06-19 12:31:57+03
        return "modified:[\\t ]+([0-9\\-:\\+ ]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd HH:mm:ssX";
    }
}
