package com.github.iamdual.adapter;

import com.github.iamdual.exceptions.InvalidAdapterException;
import com.github.iamdual.templates.Template;

/**
 * The factory of WHOIS request adapter.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class AdapterFactory {
    public Adapter getAdapter(Template template) throws InvalidAdapterException {
        switch (template.getAdapterType()) {
            case SOCKET:
                return new Socket(template);
            case HTTP:
                return new HTTP(template);
            default:
                throw new InvalidAdapterException(template.getAdapterType());
        }
    }
}
