package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .ws TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotWs extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.website.ws";
    }

    @Override
    public String getRegexAvailable() {
        return "^The queried object does not exist";
    }

    @Override
    public String getRegexExpiryDate() {
        // Registrar Registration Expiration Date: 2021-09-15T06:37:58Z
        return "Registrar Registration Expiration Date: ([0-9A-Z\\-:]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd'T'HH:mm:ss'Z'";
    }

    @Override
    public String getRegexUpdatedDate() {
        // Updated Date: 2020-09-06T14:23:53Z
        return "Updated Date: ([0-9A-Z\\-:]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd'T'HH:mm:ss'Z'";
    }
}
