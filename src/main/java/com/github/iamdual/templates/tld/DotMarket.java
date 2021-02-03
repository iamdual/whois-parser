package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.registrar.Donut;

/**
 * A WHOIS pattern of .market TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotMarket extends Donut {
    @Override
    public String getWhoisServer() {
        return "whois.nic.market";
    }
}
