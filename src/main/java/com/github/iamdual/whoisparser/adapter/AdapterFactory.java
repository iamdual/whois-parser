package com.github.iamdual.whoisparser.adapter;

import com.github.iamdual.whoisparser.templates.Template;

/**
 * The factory of WHOIS request adapter.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class AdapterFactory {
    public Adapter getAdapter(Template template) throws IllegalAccessException {
        switch (template.getAdapterType()) {
            case SOCKET:
                return new SocketAdapter(template);
            case HTTP:
                return new HTTPAdapter(template);
            default:
                throw new IllegalAccessException("Invalid adapter: " + template.getAdapterType().name());
        }
    }
}
