package com.github.iamdual.templates.registrar;

import com.github.iamdual.templates.common.CommonDate2;

/**
 * A WHOIS pattern of Uniregistry registrar.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class Uniregistry extends CommonDate2 {
    @Override
    public String getWhoisAddress() {
        return "whois.uniregistry.net";
    }

    @Override
    public String getRegexAvailable() {
        return ">>> Domain .+ is available for registration";
    }

    @Override
    public String getRegexExpiryDate() {
        // Registry Expiry Date: 2021-04-15T19:08:29.675Z
        return "Registry Expiry Date: ([0-9A-Z\\-.:]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd'T'HH:mm:ss.S'Z'";
    }

    @Override
    public String getRegexUpdatedDate() {
        // Updated Date: 2020-03-21T06:15:38.736Z
        return "Updated Date: ([0-9A-Z\\-.:]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd'T'HH:mm:ss.S'Z'";
    }
}
