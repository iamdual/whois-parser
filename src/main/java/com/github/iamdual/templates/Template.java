package com.github.iamdual.templates;

import com.github.iamdual.adapter.Adapter;

/**
 * The interface of template for WHOIS patterns.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public interface Template {
    Adapter.Type getAdapterType();

    String getWhoisServer();

    String getQueryTemplate();

    String getRegexAvailable();

    String getRegexExpiryDate();

    String getFormatExpiryDate();

    String getRegexUpdatedDate();

    String getFormatUpdatedDate();
}
