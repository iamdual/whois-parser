package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.registrar.Verisign;

/**
 * A WHOIS pattern of .tv TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotTv extends Verisign {
    @Override
    public String getWhoisServer() {
        return "tvwhois.verisign-grs.com";
    }
}
