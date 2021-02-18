package com.github.iamdual.adapter;

import com.github.iamdual.templates.Template;
import org.apache.commons.net.whois.WhoisClient;

import java.io.IOException;

/**
 * The socket adapter.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class Socket extends Adapter {

    public Socket(Template template) {
        super(template);
    }

    public String getWhoisResponse() throws IOException {
        if (response != null) {
            return response;
        }

        WhoisClient whois = new WhoisClient();
        if (proxy != null) {
            whois.setProxy(proxy);
        }
        if (timeout != null) {
            whois.setDefaultTimeout(timeout);
            whois.setConnectTimeout(timeout);
        }

        whois.connect(template.getWhoisAddress());
        if (timeout != null) {
            whois.setSoTimeout(timeout);
        }
        response = whois.query(getSocketQuery());
        whois.disconnect();

        if (response == null || response.length() == 0) {
            throw new IOException("WHOIS response is empty.");
        }

        return response;
    }

    private String getSocketQuery() {
        if (template.getQueryFormat() != null) {
            return String.format(template.getQueryFormat(), domain);
        }

        return domain;
    }
}
