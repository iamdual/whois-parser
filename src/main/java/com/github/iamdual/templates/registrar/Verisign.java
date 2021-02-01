package com.github.iamdual.templates.registrar;

import com.github.iamdual.templates.common.CommonDate1;

/**
 * A WHOIS pattern of Verisign registrar.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class Verisign extends CommonDate1 {
    @Override
    public String getWhoisServer() {
        return "whois.verisign-grs.com";
    }

    @Override
    public String getRegexAvailable() {
        return "^No match for \"";
    }
}
