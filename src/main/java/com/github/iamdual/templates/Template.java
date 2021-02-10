package com.github.iamdual.templates;

import com.github.iamdual.adapter.Adapter;

import java.net.http.HttpRequest;

/**
 * The interface of template for WHOIS patterns.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public interface Template {
    Adapter.Type getAdapterType();

    String getWhoisServer();

    String getQueryFormat();

    HttpRequest.Builder getHttpRequestBuilder();

    String getRegexAvailable();

    String getRegexExpiryDate();

    String getFormatExpiryDate();

    String getRegexUpdatedDate();

    String getFormatUpdatedDate();
}
