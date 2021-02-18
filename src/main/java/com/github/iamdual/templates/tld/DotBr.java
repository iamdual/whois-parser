package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .br TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotBr extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.registro.br";
    }

    @Override
    public String getRegexAvailable() {
        return "% No match for .+";
    }

    @Override
    public String getRegexExpiryDate() {
        // expires:  20210518
        return "expires:[\\s]+([0-9]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyyMMdd";
    }

    @Override
    public String getRegexUpdatedDate() {
        // changed:  20191105
        return "changed:[\\s]+([0-9]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyyMMdd";
    }
}
