package com.github.iamdual.adapter;

import java.io.IOException;
import java.net.Proxy;

/**
 * The interface of WHOIS request adapter.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public interface Adapter {
    enum Type {
        SOCKET,
        HTTP
    }

    public void setWhoisServer(String server);

    public void setDomain(String domain);

    public void setProxy(Proxy proxy);

    public String getWhoisResponse() throws IOException;
}
