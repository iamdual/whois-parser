package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate2;

/**
 * A WHOIS pattern of .xyz TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotXyz extends CommonDate2 {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.xyz";
    }

    @Override
    public String getRegexAvailable() {
        return "^The queried object does not exist";
    }
}
