package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate2;

/**
 * A WHOIS pattern of .site TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotSite extends CommonDate2 {
    @Override
    public String getWhoisServer() {
        return "whois.nic.site";
    }

    @Override
    public String getRegexAvailable() {
        return "^The queried object does not exist";
    }
}
