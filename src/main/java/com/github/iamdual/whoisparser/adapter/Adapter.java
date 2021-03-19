package com.github.iamdual.whoisparser.adapter;

import com.github.iamdual.whoisparser.Utils;
import com.github.iamdual.whoisparser.templates.Template;

import java.io.IOException;
import java.net.Proxy;

/**
 * The main adapter class for WHOIS response.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public abstract class Adapter {
    protected final Template template;
    protected String domain;
    protected String domainTld;
    protected Proxy proxy;
    protected Integer timeout;
    protected String response;

    public enum Type {
        SOCKET,
        HTTP
    }

    public Adapter(Template template) {
        this.template = template;
    }

    public void setDomain(String domain, String domainTld) {
        this.domain = domain;
        this.domainTld = domainTld;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public String getFormatted(String format) {
        return String.format(format, domain, domainTld, template.getWhoisAddress());
    }

    public abstract String getWhoisResponse() throws IOException;

}
