package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate1;

/**
 * A WHOIS pattern of .jobs TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotJobs extends CommonDate1 {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.jobs";
    }

    @Override
    public String getRegexAvailable() {
        return "^No match for \"";
    }
}
