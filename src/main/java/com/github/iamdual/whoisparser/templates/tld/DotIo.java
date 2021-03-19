package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.common.CommonDate1;

/**
 * A WHOIS pattern of .io TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotIo extends CommonDate1 {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.io";
    }


    @Override
    public String getRegexAvailable() {
        return "^NOT FOUND";
    }
}
