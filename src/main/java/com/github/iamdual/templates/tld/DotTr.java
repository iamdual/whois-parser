package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .tr TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotTr extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.nic.tr";
    }

    @Override
    public String getRegexAvailable() {
        return "^No match found for \"";
    }

    @Override
    public String getRegexExpiryDate() {
        // Expires on..: 2021-Dec-07.
        return "Expires on[\\.]+:[\t ]+([0-9A-Za-z\\-]+)\\.";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MMM-dd";
    }
}
