package com.github.iamdual.templates.tld;


import com.github.iamdual.adapter.Adapter;
import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .int TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotInt extends DefaultTemplate {
    @Override
    public Adapter.Type getAdapterType() {
        return Adapter.Type.HTTP;
    }

    @Override
    public String getWhoisAddress() {
        return "https://www.iana.org/whois";
    }

    @Override
    public String getHTTPMethod() {
        return "GET";
    }

    @Override
    public String getQueryFormat() {
        return "?q=%s";
    }

    @Override
    public String getRegexAvailable() {
        return "This query returned 0 objects\\.";
    }

    @Override
    public String getRegexUpdatedDate() {
        // changed:  2020-03-24
        return "changed:[\\s]+([0-9\\-]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd";
    }
}
