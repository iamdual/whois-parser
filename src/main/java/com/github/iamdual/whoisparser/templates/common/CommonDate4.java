package com.github.iamdual.whoisparser.templates.common;

import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * Common WHOIS pattern template.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class CommonDate4 extends DefaultTemplate {
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
