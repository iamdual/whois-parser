package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate1;

/**
 * A WHOIS pattern of .pw TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotPw extends CommonDate1 {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.pw";
    }

    @Override
    public String getRegexAvailable() {
        return "The queried object does not exist: DOMAIN NOT FOUND";
    }
}
