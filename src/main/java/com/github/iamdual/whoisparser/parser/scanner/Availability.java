package com.github.iamdual.whoisparser.parser.scanner;

import com.github.iamdual.whoisparser.templates.Template;

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
        if (template.getRegexAvailable() == null) {
            return null;
        }

        Pattern pattern = Pattern.compile(template.getRegexAvailable());
        Matcher matcher = pattern.matcher(whoisResponse.trim());

        return matcher.find();
    }
}
