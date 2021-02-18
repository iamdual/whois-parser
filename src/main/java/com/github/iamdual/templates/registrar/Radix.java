package com.github.iamdual.templates.registrar;

import com.github.iamdual.templates.common.CommonDate2;

/**
 * A WHOIS pattern of Radix registrar.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class Radix extends CommonDate2 {
    @Override
    public String getRegexAvailable() {
        return "^The queried object does not exist";
    }
}
