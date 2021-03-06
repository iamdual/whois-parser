package com.github.iamdual.whoisparser.templates.registry;

import com.github.iamdual.whoisparser.templates.common.CommonDate1;

/**
 * A WHOIS pattern of GRS Domains registry.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class GRSDomains extends CommonDate1 {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.%2$s";
    }

    @Override
    public String getRegexAvailable() {
        return "^No Data Found";
    }
}
