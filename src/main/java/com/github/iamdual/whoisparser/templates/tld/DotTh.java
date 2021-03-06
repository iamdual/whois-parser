package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .th TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotTh extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.thnic.co.th";
    }

    @Override
    public String getRegexAvailable() {
        return "% No match found\\.";
    }

    @Override
    public String getRegexExpiryDate() {
        // Exp date:  16 Jul 2021
        return "Exp date:[\\s]+([0-9A-Za-z ]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "dd MMM yyyy";
    }

    @Override
    public String getRegexUpdatedDate() {
        // Updated date:  01 Aug 2020
        return "Updated date:[\\s]+([0-9A-Za-z ]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "dd MMM yyyy";
    }
}
