package com.github.iamdual.whoisparser.templates.common;

import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * Common WHOIS pattern template.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class CommonDate1 extends DefaultTemplate {
    @Override
    public String getRegexExpiryDate() {
        // Registry Expiry Date: 2022-01-09T22:40:08Z
        return "Registry Expiry Date: ([0-9A-Z\\-:]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd'T'HH:mm:ss'Z'";
    }

    @Override
    public String getRegexUpdatedDate() {
        // Updated Date: 2020-10-11T17:25:56Z
        return "Updated Date: ([0-9A-Z\\-:]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd'T'HH:mm:ss'Z'";
    }
}
