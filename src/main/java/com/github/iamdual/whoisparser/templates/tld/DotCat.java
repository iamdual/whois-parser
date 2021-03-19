package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.common.CommonDate4;

/**
 * A WHOIS pattern of .cat TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotCat extends CommonDate4 {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.cat";
    }

    @Override
    public String getRegexAvailable() {
        return "The queried object does not exist: no matching objects found";
    }
}
