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

    void setWhoisServer(String server);

    void setDomain(String domain);

    void setProxy(Proxy proxy);

    String getWhoisResponse() throws IOException;
}
