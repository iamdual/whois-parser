package com.github.iamdual.templates.registrar;

import com.github.iamdual.templates.common.CommonDate2;

/**
 * A WHOIS pattern of CentralNic registrar.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class CentralNic extends CommonDate2 {
    @Override
    public String getWhoisAddress() {
        // whois-ote.centralnic.com is the alternative but it doesn't provide updated date.
        return "whois.centralnic.com";
    }

    @Override
    public String getRegexAvailable() {
        return "^The queried object does not exist";
    }
}
