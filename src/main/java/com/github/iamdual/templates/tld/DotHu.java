package com.github.iamdual.templates.tld;


import com.github.iamdual.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .hu TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotHu extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.nic.hu";
    }

    @Override
    public String getRegexAvailable() {
        return "Nincs talalat / No match";
    }
}
