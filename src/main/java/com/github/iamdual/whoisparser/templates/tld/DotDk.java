package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .dk TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotDk extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.dk-hostmaster.dk";
    }

    @Override
    public String getRegexAvailable() {
        return "No entries found for the selected source\\.";
    }

    @Override
    public String getRegexExpiryDate() {
        // Expires:  2021-08-31
        return "Expires:[\\s]+([0-9\\-]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd";
    }
}
