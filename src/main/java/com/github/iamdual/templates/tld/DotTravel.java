package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate1;

/**
 * A WHOIS pattern of .travel TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotTravel extends CommonDate1 {
    @Override
    public String getWhoisServer() {
        return "whois.nic.travel";
    }

    @Override
    public String getRegexAvailable() {
        return "^No Data Found";
    }
}
