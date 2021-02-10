package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate2;

/**
 * A WHOIS pattern of .online TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotOnline extends CommonDate2 {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.online";
    }

    @Override
    public String getRegexAvailable() {
        return "^The queried object does not exist";
    }
}
