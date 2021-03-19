package com.github.iamdual.whoisparser.templates.registrar;

import com.github.iamdual.whoisparser.templates.common.CommonDate1;

/**
 * A WHOIS pattern of Verisign registrar.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class Verisign extends CommonDate1 {
    @Override
    public String getWhoisAddress() {
        return "whois.verisign-grs.com";
    }

    @Override
    public String getRegexAvailable() {
        return "^No match for \".+";
    }
}
