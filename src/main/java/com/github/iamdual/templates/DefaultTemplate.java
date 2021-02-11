package com.github.iamdual.templates;

import com.github.iamdual.adapter.Adapter;

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
    public String getWhoisAddress() {
        return null;
    }

    @Override
    public String getQueryFormat() {
        return null;
    }

    @Override
    public String getHTTPMethod() {
        return null;
    }

    @Override
    public String getHTTPContentType() {
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
