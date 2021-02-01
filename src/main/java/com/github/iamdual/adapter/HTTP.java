package com.github.iamdual.adapter;

import java.net.Proxy;

/**
 * The HTTP adapter.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class HTTP implements Adapter {

    protected String whoisServer;
    protected String domain;
    protected Proxy proxy;
    protected String response;

    @Override
    public void setWhoisServer(String server) {
        this.whoisServer = server;
    }

    @Override
    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    @Override
    public String getWhoisResponse() {
        if (this.response != null) {
            return this.response;
        }

        // TODO: Implement a HTTP client.
        return null;
    }
}
