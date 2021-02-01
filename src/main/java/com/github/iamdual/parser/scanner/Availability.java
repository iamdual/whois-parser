package com.github.iamdual.parser.scanner;

import com.github.iamdual.templates.Template;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The availability scanner.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class Availability extends Scanner {
    public Availability(Template template, String whoisResponse) {
        super(template, whoisResponse);
    }

    public Boolean getAvailable() {
        Pattern pattern = Pattern.compile(template.getRegexAvailable());
        Matcher matcher = pattern.matcher(whoisResponse);

        return matcher.find();
    }
}
