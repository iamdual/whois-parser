package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .ar TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotAr extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.nic.ar";
    }

    @Override
    public String getRegexAvailable() {
        return "El dominio no se encuentra registrado en NIC Argentina";
    }

    @Override
    public String getRegexExpiryDate() {
        // expire:  2021-11-01 00:00:00
        return "expire:[\\s]+([0-9\\-: ]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd HH:mm:ss";
    }

    @Override
    public String getRegexUpdatedDate() {
        // changed:  2020-10-13 17:45:16.825672
        return "changed:[\\s]+([0-9\\-: ]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd HH:mm:ss";
    }
}
