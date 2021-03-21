package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.registry.Verisign;

/**
 * A WHOIS pattern of .cc TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotCc extends Verisign {
    @Override
    public String getWhoisAddress() {
        return "ccwhois.verisign-grs.com";
    }
}
