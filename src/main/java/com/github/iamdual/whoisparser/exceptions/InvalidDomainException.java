package com.github.iamdual.whoisparser.exceptions;

public class InvalidDomainException extends Exception {
    public InvalidDomainException(String domain) {
        super("Invalid domain: " + domain);
    }
}
