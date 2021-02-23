package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate1;

/**
 * A WHOIS pattern of .club TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotClub extends CommonDate1 {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.club";
    }

    @Override
    public String getRegexAvailable() {
        return "^No Data Found";
    }
}
