package com.github.iamdual.adapter;

import com.github.iamdual.templates.Template;

import java.io.IOException;
import java.net.Proxy;

/**
 * The main adapter class for WHOIS response.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public abstract class Adapter {
    protected Template template;
    protected String domain;
    protected Proxy proxy;
    protected String response;

    public enum Type {
        SOCKET,
        HTTP
    }

    public Adapter(Template template) {
        this.template = template;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    public String getWhoisResponse() throws IOException {
        return null;
    }

}
