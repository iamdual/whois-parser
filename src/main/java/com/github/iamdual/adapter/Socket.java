package com.github.iamdual.adapter;

import org.apache.commons.net.whois.WhoisClient;

import java.io.IOException;
import java.net.Proxy;

/**
 * The socket adapter.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class Socket implements Adapter {

    protected static int TIMEOUT = 30000;

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
    public String getWhoisResponse() throws IOException {
        if (this.response != null) {
            return this.response;
        }

        WhoisClient whois = new WhoisClient();
        if (proxy != null) {
            whois.setProxy(proxy);
        }
        whois.setDefaultTimeout(TIMEOUT);
        whois.setConnectTimeout(TIMEOUT);

        whois.connect(whoisServer);
        whois.setSoTimeout(TIMEOUT);
        this.response = whois.query(domain);
        whois.disconnect();

        if (this.response == null || this.response.length() == 0) {
            throw new IOException("WHOIS response is empty.");
        }

        return this.response;
    }
}
