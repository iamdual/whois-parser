package com.github.iamdual;

import com.github.iamdual.exceptions.InvalidDomainException;

public class Utils {
    public static String getDomainTld(String domain) throws InvalidDomainException {
        String[] parts = domain.split("\\.");
        if (parts.length == 0) {
            throw new InvalidDomainException(domain);
        }
        return parts[parts.length - 1];
    }
}
