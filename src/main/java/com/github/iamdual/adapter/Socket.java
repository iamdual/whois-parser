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

    protected static int TIMEOUT = 30000;

    public Socket(Template template) {
        super(template);
    }

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

        whois.connect(template.getWhoisServer());
        whois.setSoTimeout(TIMEOUT);
        this.response = whois.query(getSocketQuery());
        whois.disconnect();

        if (this.response == null || this.response.length() == 0) {
            throw new IOException("WHOIS response is empty.");
        }

        return this.response;
    }

    private String getSocketQuery() {
        if (template.getQueryTemplate() != null) {
            return String.format(template.getQueryTemplate(), domain);
        }

        return domain;
    }
}
