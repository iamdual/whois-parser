package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .it TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotIt extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.nic.it";
    }

    @Override
    public String getRegexAvailable() {
        return "Status:[\\s]+AVAILABLE";
    }

    @Override
    public String getRegexExpiryDate() {
        // Expire Date:  2021-04-05
        return "Expire Date:[\\s]+([0-9A-Z\\-]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd";
    }

    @Override
    public String getRegexUpdatedDate() {
        // Last Update:  2020-04-21 00:48:07
        return "Last Update:[\\s]+([0-9A-Z\\- :]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd HH:mm:ss";
    }
}
