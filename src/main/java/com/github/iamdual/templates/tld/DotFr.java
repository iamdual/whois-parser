package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .fr TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotFr extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.nic.fr";
    }

    @Override
    public String getRegexAvailable() {
        return "No entries found in the AFNIC Database\\.";
    }

    @Override
    public String getRegexExpiryDate() {
        // Expiry Date: 2022-09-04T22:09:12Z
        return "Expiry Date:[\\t ]+([0-9A-Z\\-:]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd'T'HH:mm:ss'Z'";
    }

    @Override
    public String getRegexUpdatedDate() {
        // last-update: 2019-08-18T11:39:43Z
        return "last-update:[\\t ]+([0-9A-Z\\-:]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd'T'HH:mm:ss'Z'";
    }
}
