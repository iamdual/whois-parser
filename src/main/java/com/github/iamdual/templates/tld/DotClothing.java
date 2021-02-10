package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.registrar.Donut;

/**
 * A WHOIS pattern of .clothing TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotClothing extends Donut {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.clothing";
    }
}
