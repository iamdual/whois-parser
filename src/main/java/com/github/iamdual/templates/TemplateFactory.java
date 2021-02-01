package com.github.iamdual.templates;

import com.github.iamdual.Utils;
import com.github.iamdual.exceptions.InvalidDomainException;
import com.github.iamdual.exceptions.UnsupportedTldException;
import com.github.iamdual.templates.registrar.Google;
import com.github.iamdual.templates.registrar.Verisign;
import com.github.iamdual.templates.tld.DotCc;
import com.github.iamdual.templates.tld.DotIo;
import com.github.iamdual.templates.tld.DotTv;

/**
 * The factory of template for WHOIS patterns.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class TemplateFactory {
    public Template getTemplate(String domain) throws UnsupportedTldException, InvalidDomainException {
        String tld = Utils.getDomainTld(domain);

        switch (tld) {
            case "com":
            case "net":
                return new Verisign();
            case "app":
            case "dev":
            case "how":
                return new Google();
            case "tv":
                return new DotTv();
            case "cc":
                return new DotCc();
            case "io":
                return new DotIo();
            default:
                throw new UnsupportedTldException(tld);
        }
    }
}
