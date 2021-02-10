package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .uk TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotUk extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.nic.uk";
    }

    @Override
    public String getRegexAvailable() {
        return "^No match for \"";
    }

    @Override
    public String getRegexExpiryDate() {
        // Registered on: 14-Feb-1999
        return "Expiry date:[\\t ]+([0-9A-Za-z\\-]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "dd-MMM-yyyy";
    }

    @Override
    public String getRegexUpdatedDate() {
        // Last updated:  13-Jan-2021
        return "Last updated:[\\t ]+([0-9A-Za-z\\-]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "dd-MMM-yyyy";
    }
}
