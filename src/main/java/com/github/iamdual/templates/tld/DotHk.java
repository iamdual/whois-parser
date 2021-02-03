package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .hk TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotHk extends DefaultTemplate {
    @Override
    public String getWhoisServer() {
        return "whois.hkirc.hk";
    }

    @Override
    public String getRegexAvailable() {
        return "^The domain has not been registered\\.";
    }

    @Override
    public String getRegexExpiryDate() {
        // Expiry Date:  05-06-2021
        return "Expiry Date:[\\t ]+([0-9\\-]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "dd-MM-yyyy";
    }

    @Override
    public String getRegexUpdatedDate() {
        // No updated date section
        return null;
    }

    @Override
    public String getFormatUpdatedDate() {
        return null;
    }
}