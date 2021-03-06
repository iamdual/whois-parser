package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.registry.Verisign;

/**
 * A WHOIS pattern of .tv TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotTv extends Verisign {
    @Override
    public String getWhoisAddress() {
        return "tvwhois.verisign-grs.com";
    }
}
