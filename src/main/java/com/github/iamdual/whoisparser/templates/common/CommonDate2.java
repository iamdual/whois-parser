package com.github.iamdual.whoisparser.templates.common;

import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * Common WHOIS pattern template.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class CommonDate2 extends DefaultTemplate {
    @Override
    public String getRegexExpiryDate() {
        // Registry Expiry Date: 2021-06-05T23:59:59.0Z
        return "Registry Expiry Date: ([0-9A-Z\\-.:]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd'T'HH:mm:ss'.0Z'";
    }

    @Override
    public String getRegexUpdatedDate() {
        // Updated Date: 2020-07-02T02:36:14.0Z
        return "Updated Date: ([0-9A-Z\\-.:]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd'T'HH:mm:ss'.0Z'";
    }
}
