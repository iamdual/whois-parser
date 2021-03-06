package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .de TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotDe extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.denic.de";
    }

    @Override
    public String getQueryFormat() {
        // https://www.denic.de/en/service/whois-service/
        return "-T dn %s";
    }

    @Override
    public String getRegexAvailable() {
        return "Status: free$";
    }

    @Override
    public String getRegexUpdatedDate() {
        // Changed: 2019-09-24T20:06:12+02:00
        return "Changed: ([0-9A-Z\\-+:]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd'T'HH:mm:ssXXX";
    }
}
