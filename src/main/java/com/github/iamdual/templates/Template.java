package com.github.iamdual.templates;

import com.github.iamdual.adapter.Adapter;

/**
 * The interface of template for WHOIS patterns.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public interface Template {
    public Adapter.Type getAdapterType();

    public String getWhoisServer();

    public String getRegexAvailable();

    public String getRegexExpiryDate();

    public String getFormatExpiryDate();

    public String getRegexUpdateDate();

    public String getFormatUpdateDate();
}
