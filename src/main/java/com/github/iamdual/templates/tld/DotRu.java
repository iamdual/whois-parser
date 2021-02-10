package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .hk TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotRu extends DefaultTemplate {
    @Override
    public String getWhoisAddress() {
        return "whois.tcinet.ru";
    }

    @Override
    public String getRegexAvailable() {
        return "No entries found for the selected source\\(s\\)\\.";
    }

    @Override
    public String getRegexExpiryDate() {
        // paid-till:  2021-05-31T21:00:00Z
        return "paid-till:[\\t ]+([0-9A-Z\\-\\.:]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd'T'HH:mm:ss'Z'";
    }
}
