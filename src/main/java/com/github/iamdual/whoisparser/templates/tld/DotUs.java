package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.common.CommonDate1;

/**
 * A WHOIS pattern of .us TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotUs extends CommonDate1 {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.us";
    }

    @Override
    public String getRegexAvailable() {
        return "^No Data Found";
    }
}
