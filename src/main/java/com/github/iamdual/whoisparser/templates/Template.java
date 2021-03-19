package com.github.iamdual.whoisparser.templates;

import com.github.iamdual.whoisparser.adapter.Adapter;

/**
 * The interface of template for WHOIS patterns.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public interface Template {
    Adapter.Type getAdapterType();

    String getWhoisAddress();

    String getQueryFormat();

    String getHTTPMethod();

    String getHTTPContentType();

    String getRegexAvailable();

    String getRegexExpiryDate();

    String getFormatExpiryDate();

    String getRegexUpdatedDate();

    String getFormatUpdatedDate();
}
