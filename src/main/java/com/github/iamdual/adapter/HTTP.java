package com.github.iamdual.adapter;

import com.github.iamdual.templates.Template;

/**
 * The HTTP adapter.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class HTTP extends Adapter {

    public HTTP(Template template) {
        super(template);
    }

    public String getWhoisResponse() {
        if (this.response != null) {
            return this.response;
        }

        // TODO: Implement a HTTP client.
        return null;
    }
}
