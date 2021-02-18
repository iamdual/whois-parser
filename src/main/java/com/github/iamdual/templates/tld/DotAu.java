package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .au TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotAu extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.auda.org.au";
    }

    @Override
    public String getRegexAvailable() {
        return "^NOT FOUND";
    }

    @Override
    public String getRegexUpdatedDate() {
        // Last Modified: 2020-11-04T10:42:23Z
        return "Last Modified:[\\s]+([0-9A-Z\\-:]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd'T'HH:mm:ss'Z'";
    }
}
