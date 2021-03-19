package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.common.CommonDate4;

/**
 * A WHOIS pattern of .ma TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotMa extends CommonDate4 {
    @Override
    public String getWhoisAddress() {
        return "whois.registre.ma";
    }

    @Override
    public String getRegexAvailable() {
        return "Domain Status: No Object Found";
    }
}
