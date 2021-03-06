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
    public String getWhoisAddress() {
        return "whois.dns.pl";
    }

    @Override
    public String getRegexAvailable() {
        return "No information available about domain name .+";
    }

    @Override
    public String getRegexExpiryDate() {
        // option expiration date:  2023.10.14 09:30:46
        return "option expiration date:[\\s]+([0-9\\.: ]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy.MM.dd HH:mm:ss";
    }

    @Override
    public String getRegexUpdatedDate() {
        // last modified:  2020.12.21 18:25:05
        return "modified:[\\s]+([0-9\\.: ]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy.MM.dd HH:mm:ss";
    }
}
