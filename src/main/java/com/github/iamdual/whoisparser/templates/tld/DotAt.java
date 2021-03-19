package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .at TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotAt extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.nic.at";
    }

    @Override
    public String getRegexAvailable() {
        return "% nothing found";
    }

    @Override
    public String getRegexUpdatedDate() {
        // changed:  20110426 17:57:27
        return "changed:[\\s]+([0-9: ]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyyMMdd HH:mm:ss";
    }
}
