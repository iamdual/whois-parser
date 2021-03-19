package com.github.iamdual.whoisparser.templates.registrar;

import com.github.iamdual.whoisparser.templates.common.CommonDate1;

/**
 * A WHOIS pattern of Donut registrar.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class Donuts extends CommonDate1 {
    @Override
    public String getWhoisAddress() {
        return "whois.donuts.co";
    }

    @Override
    public String getRegexAvailable() {
        return "^Domain not found\\.";
    }
}
