package com.github.iamdual.whoisparser.templates.common;

import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * Common WHOIS pattern template.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class CommonDate3 extends DefaultTemplate {
    @Override
    public String getRegexExpiryDate() {
        // Registry Expiry Date: 2022-02-10T16:00:00Z
        return "Registry Expiry Date:[\\s]+([0-9A-Z\\-:]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd'T'HH:mm:ss'Z'";
    }

    @Override
    public String getRegexUpdatedDate() {
        // Updated Date: 2021-02-10T16:00:17Z
        return "Updated Date:[\\s]+([0-9A-Z\\-:]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd'T'HH:mm:ss'Z'";
    }
}
