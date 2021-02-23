package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate2;

/**
 * A WHOIS pattern of .wiki TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotWiki extends CommonDate2 {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.wiki";
    }

    @Override
    public String getRegexAvailable() {
        return "The queried object does not exist: DOMAIN NOT FOUND";
    }
}
