package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .ai TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotAi extends DefaultTemplate {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.ai";
    }

    @Override
    public String getRegexAvailable() {
        return "Domain Status: No Object Found";
    }
}
