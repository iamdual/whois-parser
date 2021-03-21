package com.github.iamdual.whoisparser.templates.registry;

import com.github.iamdual.whoisparser.templates.common.CommonDate2;

/**
 * A WHOIS pattern of GMO registry.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class GMO extends CommonDate2 {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.%2$s";
    }

    @Override
    public String getRegexAvailable() {
        return "^The queried object does not exist";
    }
}
