package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .cn TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotCn extends DefaultTemplate {
    @Override
    public String getWhoisAddress() {
        return "whois.cnnic.cn";
    }

    @Override
    public String getRegexAvailable() {
        return "^No matching record\\.";
    }

    @Override
    public String getRegexExpiryDate() {
        // Expiration Time: 2021-03-17 12:48:36
        return "Expiration Time: ([0-9A-Z\\-: ]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd HH:mm:ss";
    }
}
