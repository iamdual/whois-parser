package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.registrar.Radix;

/**
 * A WHOIS pattern of .store TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotStore extends Radix {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.store";
    }
}
