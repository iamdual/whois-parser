package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate1;

/**
 * A WHOIS pattern of .in TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotIn extends CommonDate1 {
    @Override
    public String getWhoisAddress() {
        return "whois.registry.in";
    }

    @Override
    public String getRegexAvailable() {
        return "^No Data Found";
    }
}
