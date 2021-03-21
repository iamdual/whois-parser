package com.github.iamdual.whoisparser.templates.registry;

import com.github.iamdual.whoisparser.templates.common.CommonDate1;

/**
 * A WHOIS pattern of Famous Four Media registry.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class FamousFourMedia extends CommonDate1 {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.%2$s";
    }

    @Override
    public String getRegexAvailable() {
        return "^No Data Found";
    }
}
