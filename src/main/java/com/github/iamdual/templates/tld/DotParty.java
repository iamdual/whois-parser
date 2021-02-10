package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate1;

/**
 * A WHOIS pattern of .party TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotParty extends CommonDate1 {

    @Override
    public String getWhoisServer() {
        return "whois.nic.party";
    }

    @Override
    public String getRegexAvailable() {
        return "^No Data Found";
    }

}