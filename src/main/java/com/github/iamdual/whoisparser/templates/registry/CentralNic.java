package com.github.iamdual.whoisparser.templates.registry;

import com.github.iamdual.whoisparser.templates.common.CommonDate2;

/**
 * A WHOIS pattern of CentralNic registry.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class CentralNic extends CommonDate2 {
    @Override
    public String getWhoisAddress() {
        // alternatively whois.centralnic.com can be used.
        return "whois.nic.%2$s";
    }

    @Override
    public String getRegexAvailable() {
        return "^The queried object does not exist";
    }
}
