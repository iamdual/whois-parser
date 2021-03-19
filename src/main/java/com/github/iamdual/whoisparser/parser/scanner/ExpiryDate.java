package com.github.iamdual.whoisparser.parser.scanner;

import com.github.iamdual.whoisparser.templates.Template;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The expiry date scanner.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class ExpiryDate extends Scanner {
    public ExpiryDate(Template template, String whoisResponse) {
        super(template, whoisResponse);
    }

    public Date getExpiryDate() {
        if (template.getRegexExpiryDate() == null || template.getFormatExpiryDate() == null) {
            return null;
        }

        Pattern pattern = Pattern.compile(template.getRegexExpiryDate());
        Matcher matcher = pattern.matcher(whoisResponse);

        if (matcher.find()) {
            try {
                SimpleDateFormat date = new SimpleDateFormat(template.getFormatExpiryDate());
                if (matcher.groupCount() < 1) {
                    return null;
                }
                return date.parse(matcher.group(1));
            } catch (Exception e) {
                return null;
            }
        }

        return null;
    }
}
