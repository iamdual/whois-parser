package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate2;

/**
 * A WHOIS pattern of .store TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotStore extends CommonDate2 {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.store";
    }

    @Override
    public String getRegexAvailable() {
        return "^The queried object does not exist";
    }
}
