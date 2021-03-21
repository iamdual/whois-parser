package com.github.iamdual.whoisparser.templates.registry;

import com.github.iamdual.whoisparser.templates.common.CommonDate4;

/**
 * A WHOIS pattern of Uniregistry registry.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class Uniregistry extends CommonDate4 {
    @Override
    public String getWhoisAddress() {
        return "whois.uniregistry.net";
    }

    @Override
    public String getRegexAvailable() {
        return ">>> Domain .+ is available for registration";
    }
}
