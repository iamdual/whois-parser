package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .im TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotIm extends DefaultTemplate {
    @Override
    public String getWhoisAddress() {
        return "whois.nic.im";
    }

    @Override
    public String getRegexAvailable() {
        return "The domain .+ was not found\\.";
    }

    @Override
    public String getRegexExpiryDate() {
        // Expiry Date: 10/08/2021 23:59:45
        return "Expiry Date:[\\s]+([0-9/: ]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "dd/MM/yyyy HH:mm:ss";
    }
}
