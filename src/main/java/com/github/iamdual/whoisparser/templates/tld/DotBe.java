package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .be TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotBe extends DefaultTemplate {
    @Override
    public String getWhoisAddress() {
        return "whois.dns.be";
    }

    @Override
    public String getRegexAvailable() {
        return "Status:[\\s]+AVAILABLE";
    }
}
