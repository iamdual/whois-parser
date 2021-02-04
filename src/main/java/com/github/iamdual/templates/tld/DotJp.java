package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .jp TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotJp extends DefaultTemplate {
    @Override
    public String getWhoisServer() {
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
        return "\\[(?:Expires on|有効期限)\\][\\t ]+([0-9\\/]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy/MM/dd";
    }

    @Override
    public String getRegexUpdatedDate() {
        // No updated date section.
        return null;
    }

    @Override
    public String getFormatUpdatedDate() {
        return null;
    }
}
