package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .cz TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotCz extends DefaultTemplate {

    @Override
    public String getWhoisServer() {
        return "whois.nic.cz";
    }

    @Override
    public String getRegexAvailable() {
        return "%ERROR:101: no entries found";
    }

    @Override
    public String getRegexExpiryDate() {
        // expire:  28.10.2025
        return "expire:[\\t ]+([0-9.]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "dd.MM.yyyy";
    }

    @Override
    public String getRegexUpdatedDate() {
        // changed:  29.09.2015 09:40:23
        return "changed:[\\t ]+([0-9.: ]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "dd.MM.yyyy HH:mm:ss";
    }
}