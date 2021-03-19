package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .tw TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotTw extends DefaultTemplate {
    @Override
    public String getWhoisAddress() {
        return "whois.twnic.net.tw";
    }

    @Override
    public String getRegexAvailable() {
        return "^No Found";
    }

    @Override
    public String getRegexExpiryDate() {
        // Record expires on 2021-10-31 (YYYY-MM-DD)
        return "Record expires on ([0-9\\-]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy-MM-dd";
    }
}
