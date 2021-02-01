package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate1;

/**
 * A WHOIS pattern of .capital TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotCapital extends CommonDate1 {
    @Override
    public String getWhoisServer() {
        return "whois.nic.capital";
    }

    @Override
    public String getRegexAvailable() {
        return "^Domain not found\\.";
    }
}
