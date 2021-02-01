package com.github.iamdual.exceptions;

public class UnsupportedTldException extends Exception {
    public UnsupportedTldException(String tld) {
        super("Unsupported TLD: " + tld);
    }
}
