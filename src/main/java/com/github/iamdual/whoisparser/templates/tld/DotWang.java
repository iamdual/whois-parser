package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.common.CommonDate1;

/**
 * A WHOIS pattern of .wang TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotWang extends CommonDate1 {
    @Override
    public String getWhoisAddress() {
        return "whois.gtld.knet.cn";
    }

    @Override
    public String getRegexAvailable() {
        return "The queried object does not exist: .+";
    }
}
