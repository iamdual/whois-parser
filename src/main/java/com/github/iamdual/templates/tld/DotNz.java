package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .nz TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotNz extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.srs.net.nz";
    }

    @Override
    public String getRegexAvailable() {
        return "query_status: 220 Available";
    }

    @Override
    public String getRegexUpdatedDate() {
        // domain_datelastmodified: 2020-08-21T15:27:01+12:00
        return "domain_datelastmodified:[\\t ]+([0-9A-Z\\-+:]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd'T'HH:mm:ssXXX";
    }
}
