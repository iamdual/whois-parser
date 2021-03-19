package com.github.iamdual.whoisparser;

import com.github.iamdual.whoisparser.exceptions.InvalidDomainException;

public class Utils {
    public static String getDomainTld(String domain) throws InvalidDomainException {
        String[] parts = domain.split("\\.");
        if (parts.length <= 1) {
            throw new InvalidDomainException(domain);
        }
        return parts[parts.length - 1].toLowerCase();
    }
}
