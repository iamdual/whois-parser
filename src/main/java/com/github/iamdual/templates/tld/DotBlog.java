package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.common.CommonDate2;

/**
 * A WHOIS pattern of .blog TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotBlog extends CommonDate2 {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.blog";
    }

    @Override
    public String getRegexAvailable() {
        return "^The queried object does not exist";
    }
}
