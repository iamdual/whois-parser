package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .ir TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotIr extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.nic.ir";
    }

    @Override
    public String getRegexAvailable() {
        return "%ERROR:101: no entries found";
    }

    @Override
    public String getRegexExpiryDate() {
        // expire-date:  2021-12-22
        return "expire-date:[\\t ]+([0-9\\-]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd";
    }

    @Override
    public String getRegexUpdatedDate() {
        // last-updated:  2020-11-23
        return "last-updated:[\\t ]+([0-9\\-]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd";
    }
}
