package com.github.iamdual.exceptions;

import com.github.iamdual.adapter.Adapter;

@Deprecated
public class InvalidAdapterException extends Exception {
    public InvalidAdapterException(Adapter.Type adapterType) {
        super("Invalid adapter: " + adapterType);
    }
}
