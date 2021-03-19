package com.github.iamdual.whoisparser.templates.registrar;

import com.github.iamdual.whoisparser.templates.common.CommonDate1;

/**
 * A WHOIS pattern of MMX registrar.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class MMX extends CommonDate1 {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.%2$s";
    }

    @Override
    public String getRegexAvailable() {
        return "^This domain name has not been registered\\.";
    }
}
