package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .sk TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotSk extends DefaultTemplate {
    @Override
    public String getWhoisAddress() {
        return "whois.sk-nic.sk";
    }

    @Override
    public String getRegexAvailable() {
        return "^Domain not found\\.";
    }

    @Override
    public String getRegexExpiryDate() {
        // Valid Until:  2021-03-11
        return "Valid Until:[\\s]+([0-9A-Z\\-]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd";
    }

    @Override
    public String getRegexUpdatedDate() {
        // Updated:  2020-03-11
        return "Updated:[\\s]+([0-9A-Z\\-]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd";
    }
}
