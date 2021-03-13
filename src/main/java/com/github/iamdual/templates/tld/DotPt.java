package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .pt TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotPt extends DefaultTemplate {
    @Override
    public String getWhoisAddress() {
        return "whois.dns.pt";
    }

    @Override
    public String getRegexAvailable() {
        return ".+ - No Match";
    }

    @Override
    public String getRegexExpiryDate() {
        // Expiration Date: 28/02/2022 23:59:00
        return "Expiration Date:[\\s]+([0-9/: ]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "dd/MM/yyyy HH:mm:ss";
    }
}
