package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.registrar.Verisign;

/**
 * A WHOIS pattern of .io TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotIo extends Verisign {
    @Override
    public String getWhoisServer() {
        return "whois.nic.io";
    }

    @Override
    public String getRegexAvailable() {
        return "^NOT FOUND";
    }
}
