package com.github.iamdual.adapter;

import com.github.iamdual.exceptions.InvalidAdapterException;

/**
 * The factory of WHOIS request adapter.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class AdapterFactory {
    public Adapter getAdapter(Adapter.Type adapterType) throws InvalidAdapterException {
        switch (adapterType) {
            case SOCKET:
                return new Socket();
            case HTTP:
                return new HTTP();
            default:
                throw new InvalidAdapterException(adapterType);
        }
    }
}
