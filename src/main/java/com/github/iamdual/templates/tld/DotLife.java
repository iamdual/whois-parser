package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate1;

/**
 * A WHOIS pattern of .life TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotLife extends CommonDate1 {

    @Override
    public String getWhoisServer() {
        return "whois.nic.life";
    }

    @Override
    public String getRegexAvailable() {
        return "^Domain not found\\.";
    }

}
