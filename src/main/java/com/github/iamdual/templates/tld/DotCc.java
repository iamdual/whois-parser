package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.registrar.Verisign;

/**
 * A WHOIS pattern of .cc TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotCc extends Verisign {
    @Override
    public String getWhoisServer() {
        return "ccwhois.verisign-grs.com";
    }
}
