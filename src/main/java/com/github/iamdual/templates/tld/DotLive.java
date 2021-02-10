package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate1;

/**
 * A WHOIS pattern of .live TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotLive extends CommonDate1 {

    @Override
    public String getWhoisAddress() {
        return "whois.nic.live";
    }

    @Override
    public String getRegexAvailable() {
        return "^Domain not found\\.";
    }

}
