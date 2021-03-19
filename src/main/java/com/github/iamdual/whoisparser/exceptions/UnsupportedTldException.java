package com.github.iamdual.whoisparser.exceptions;

public class UnsupportedTldException extends Exception {
    public UnsupportedTldException(String tld) {
        super("Unsupported TLD: " + tld);
    }
}
