package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.common.CommonDate3;

/**
 * A WHOIS pattern of .work TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotWork extends CommonDate3 {

    @Override
    public String getWhoisAddress() {
        return "whois.nic.work";
    }

    @Override
    public String getRegexAvailable() {
        return "This domain name has not been registered\\.";
    }
}
