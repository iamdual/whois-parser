package com.github.iamdual.whoisparser.templates.tld;

import com.github.iamdual.whoisparser.templates.common.CommonDate1;

/**
 * A WHOIS pattern of .top TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotTop extends CommonDate1 {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.top";
    }

    @Override
    public String getRegexAvailable() {
        return "^The queried object does not exist";
    }
}
