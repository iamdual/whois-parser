package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate1;

/**
 * A WHOIS pattern of .bid TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotBid extends CommonDate1 {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.bid";
    }

    @Override
    public String getRegexAvailable() {
        return "^No Data Found";
    }
}
