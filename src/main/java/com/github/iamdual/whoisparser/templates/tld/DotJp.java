package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .jp TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotJp extends DefaultTemplate {
    @Override
    public String getWhoisAddress() {
        return "whois.jprs.jp";
    }

    @Override
    public String getQueryFormat() {
        return "%s/e";
    }

    @Override
    public String getRegexAvailable() {
        return "No match!!";
    }

    @Override
    public String getRegexExpiryDate() {
        // [Expires on]  2021/05/31
        return "\\[(?:Expires on|有効期限)\\][\\s]+([0-9\\/]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy/MM/dd";
    }
}
