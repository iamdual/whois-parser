package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .id TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotId extends DefaultTemplate {

    @Override
    public String getWhoisServer() {
        return "whois.id";
    }

    @Override
    public String getRegexAvailable() {
        return "^DOMAIN NOT FOUND";
    }

    @Override
    public String getRegexExpiryDate() {
        // Expiration Date:2021-04-17 23:59:59
        return "Expiration Date:([0-9\\-: ]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd HH:mm:ss";
    }

    @Override
    public String getRegexUpdatedDate() {
        // Last Updated On:2020-03-22 03:39:46
        return "Last Updated On:([0-9\\-: ]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd HH:mm:ss";
    }
}
