package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.registrar.Donuts;

/**
 * A WHOIS pattern of .plus TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotPlus extends Donuts {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.plus";
    }
}
