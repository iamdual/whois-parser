package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .se TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotSe extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.iis.se";
    }

    @Override
    public String getRegexAvailable() {
        return "domain \".+\" not found\\.";
    }

    @Override
    public String getRegexExpiryDate() {
        // expires:  2021-10-20
        return "expires:[\\s]+([0-9\\-]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd";
    }

    @Override
    public String getRegexUpdatedDate() {
        // modified:  2020-09-18
        return "modified:[\\s]+([0-9\\-]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd";
    }
}
