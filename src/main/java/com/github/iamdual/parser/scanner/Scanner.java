package com.github.iamdual.parser.scanner;

import com.github.iamdual.templates.Template;

/**
 * The scanner abstract.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public abstract class Scanner {
    protected Template template;
    protected String whoisResponse;

    public Scanner(Template template, String whoisResponse) {
        this.template = template;
        this.whoisResponse = whoisResponse;
    }
}
