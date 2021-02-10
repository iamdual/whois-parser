package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .nl TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotNl extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.domain-registry.nl";
    }

    @Override
    public String getRegexAvailable() {
        return ".+ is free$";
    }

    @Override
    public String getRegexUpdatedDate() {
        // Updated Date: 2015-12-30
        return "Updated Date:[\\t ]+([0-9\\-]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy-MM-dd";
    }
}
