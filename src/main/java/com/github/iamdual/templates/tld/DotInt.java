package com.github.iamdual.templates.tld;


import com.github.iamdual.adapter.Adapter;
import com.github.iamdual.templates.DefaultTemplate;

import java.net.http.HttpRequest;

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
    public String getWhoisServer() {
        return "whois.nic.ai";
    }

    @Override
    public String getQueryFormat() {
        return "https://www.iana.org/whois?q=%s";
    }

    @Override
    public String getRegexAvailable() {
        return "This query returned 0 objects\\.";
    }

    @Override
    public HttpRequest.Builder getHttpRequestBuilder() {
        return HttpRequest.newBuilder()
                .GET()
                .setHeader("User-Agent", "Mozilla/5.0")
                .setHeader("Referer", "https://www.iana.org");
    }

    @Override
    public String getRegexUpdatedDate() {
        // changed:  2020-03-24
        return "changed:[\\t ]+([0-9\\-]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd";
    }
}
