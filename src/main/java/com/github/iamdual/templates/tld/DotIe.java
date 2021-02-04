package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate1;

/**
 * A WHOIS pattern of .ie TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotIe extends CommonDate1 {

    @Override
    public String getWhoisServer() {
        return "whois.iedr.ie";
    }

    @Override
    public String getRegexAvailable() {
        return "^Not found: .+";
    }

}
