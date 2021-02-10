package com.github.iamdual.templates;

import com.github.iamdual.adapter.Adapter;

import java.net.http.HttpRequest;

/**
 * Default WHOIS pattern template.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DefaultTemplate implements Template {
    @Override
    public Adapter.Type getAdapterType() {
        return Adapter.Type.SOCKET;
    }

    @Override
    public String getWhoisServer() {
        return null;
    }

    @Override
    public String getQueryFormat() {
        return null;
    }

    @Override
    public HttpRequest.Builder getHttpRequestBuilder() {
        return null;
    }

    @Override
    public String getRegexAvailable() {
        return null;
    }

    @Override
    public String getRegexExpiryDate() {
        return null;
    }

    @Override
    public String getFormatExpiryDate() {
        return null;
    }

    @Override
    public String getRegexUpdatedDate() {
        return null;
    }

    @Override
    public String getFormatUpdatedDate() {
        return null;
    }
}
