package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .no TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotNo extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.norid.no";
    }

    @Override
    public String getRegexAvailable() {
        return "% No match";
    }

    @Override
    public String getRegexUpdatedDate() {
        // Last updated:  2020-12-02
        return "Last updated:[\\t ]+([0-9\\-]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd";
    }
}
