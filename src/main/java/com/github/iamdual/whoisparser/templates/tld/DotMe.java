package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.common.CommonDate1;

/**
 * A WHOIS pattern of .me TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotMe extends CommonDate1 {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.me";
    }


    @Override
    public String getRegexAvailable() {
        return "^NOT FOUND";
    }
}
