package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate1;

/**
 * A WHOIS pattern of .shoes TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotShoes extends CommonDate1 {
    @Override
    public String getWhoisServer() {
        return "whois.nic.shoes";
    }

    @Override
    public String getRegexAvailable() {
        return "^Domain not found\\.";
    }
}
