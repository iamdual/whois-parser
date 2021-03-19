package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.common.CommonDate1;

/**
 * A WHOIS pattern of .org TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotOrg extends CommonDate1 {
    @Override
    public String getWhoisAddress() {
        return "whois.pir.org";
    }


    @Override
    public String getRegexAvailable() {
        return "^NOT FOUND";
    }
}
