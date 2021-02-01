package com.github.iamdual.templates.registrar;

import com.github.iamdual.templates.common.CommonDate1;

/**
 * A WHOIS pattern of Google registrar.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class Google extends CommonDate1 {
    @Override
    public String getWhoisServer() {
        return "whois.nic.google";
    }

    @Override
    public String getRegexAvailable() {
        return "^Domain not found\\.";
    }
}
