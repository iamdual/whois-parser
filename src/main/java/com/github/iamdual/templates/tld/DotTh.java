package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

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
        return "Exp date:[\\t ]+([0-9A-Za-z ]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "dd MMM yyyy";
    }

    @Override
    public String getRegexUpdatedDate() {
        // Updated date:  01 Aug 2020
        return "Updated date:[\\t ]+([0-9A-Za-z ]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "dd MMM yyyy";
    }
}
