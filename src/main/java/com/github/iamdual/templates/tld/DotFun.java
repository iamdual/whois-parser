package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.registrar.Radix;

/**
 * A WHOIS pattern of .fun TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotFun extends Radix {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.fun";
    }
}
