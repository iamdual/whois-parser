package com.github.iamdual.whoisparser.templates.registry;

import com.github.iamdual.whoisparser.templates.common.CommonDate1;

/**
 * A WHOIS pattern of Afilias registry.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class Afilias extends CommonDate1 {
    @Override
    public String getWhoisAddress() {
        return "whois.afilias.net";
    }

    @Override
    public String getRegexAvailable() {
        return "^NOT FOUND";
    }
}
