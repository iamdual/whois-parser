package com.github.iamdual.templates.registrar;

import com.github.iamdual.templates.common.CommonDate1;

/**
 * A WHOIS pattern of Donut registrar.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class Donut extends CommonDate1 {
    @Override
    public String getRegexAvailable() {
        return "^Domain not found\\.";
    }
}
