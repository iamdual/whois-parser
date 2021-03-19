package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .ai TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotEu extends DefaultTemplate {
    @Override
    public String getWhoisAddress() {
        return "whois.eu";
    }

    @Override
    public String getRegexAvailable() {
        return "Status: AVAILABLE$";
    }
}
