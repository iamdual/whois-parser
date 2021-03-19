package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .st TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotSt extends DefaultTemplate {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.st";
    }

    @Override
    public String getRegexAvailable() {
        return "No entries found for domain .+";
    }

    @Override
    public String getRegexExpiryDate() {
        // expiration-date: 2021-06-15 18:24:45
        return "expiration-date:[\\s]+([0-9-: ]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd HH:mm:ss";
    }

    @Override
    public String getRegexUpdatedDate() {
        // updated-date:  2020-05-14 09:37:56
        return "updated-date:[\\s]+([0-9-: ]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd HH:mm:ss";
    }
}
