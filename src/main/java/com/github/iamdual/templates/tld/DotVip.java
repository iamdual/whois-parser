package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate3;

/**
 * A WHOIS pattern of .vip TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotVip extends CommonDate3 {

    @Override
    public String getWhoisAddress() {
        return "whois.nic.vip";
    }

    @Override
    public String getRegexAvailable() {
        return "This domain name has not been registered\\.";
    }
}
