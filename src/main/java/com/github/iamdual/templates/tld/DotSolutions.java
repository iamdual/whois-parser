package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.registrar.Donut;

/**
 * A WHOIS pattern of .solutions TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotSolutions extends Donut {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.solutions";
    }
}
