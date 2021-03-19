package com.github.iamdual.whoisparser.templates.tld;


import com.github.iamdual.whoisparser.templates.DefaultTemplate;

/**
 * A WHOIS pattern of .kr TLD.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class DotKr extends DefaultTemplate {

    @Override
    public String getWhoisAddress() {
        return "whois.kr";
    }

    @Override
    public String getRegexAvailable() {
        return "The requested domain was not found in the Registry";
    }

    @Override
    public String getRegexExpiryDate() {
        // Expiration Date  : 2021. 02. 28.
        return "Expiration Date[\\s]+:[\\s]+([0-9\\. ]+)";
    }

    @Override
    public String getFormatExpiryDate() {
        return "yyyy. MM. dd.";
    }

    @Override
    public String getRegexUpdatedDate() {
        // Last Updated Date  : 2019. 02. 12.
        return "Last Updated Date[\\s]+:[\\s]+([0-9\\. ]+)";
    }

    @Override
    public String getFormatUpdatedDate() {
        return "yyyy. MM. dd.";
    }
}
