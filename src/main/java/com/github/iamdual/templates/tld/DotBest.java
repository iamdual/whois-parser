package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate2;

/**
 * A WHOIS pattern of .best TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotBest extends CommonDate2 {
    @Override
    public String getWhoisServer() {
        return "whois.nic.best";
    }

    @Override
    public String getRegexAvailable() {
        return "^The queried object does not exist";
    }
}