package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .pl TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotPl extends DefaultTemplate {

    @Override
    public String getWhoisServer() {
        return "whois.dns.pl";
    }

    @Override
    public String getRegexAvailable() {
        return "No information available about domain name .+";
    }

    @Override
    public String getRegexExpiryDate() {
        // renewal date:  2028.01.31 13:00:00
        return "renewal date:[\\t ]+([0-9\\.: ]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy.MM.dd HH:mm:ss";
    }

    @Override
    public String getRegexUpdatedDate() {
        // last modified:  2020.12.21 18:25:05
        return "modified:[\\t ]+([0-9\\.: ]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy.MM.dd HH:mm:ss";
    }
}
