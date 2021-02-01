package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate1;

/**
 * A WHOIS pattern of .ca TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotCa extends CommonDate1 {
    @Override
    public String getWhoisServer() {
        return "whois.cira.ca";
    }

    @Override
    public String getRegexAvailable() {
        return "^Not found:";
    }
}
