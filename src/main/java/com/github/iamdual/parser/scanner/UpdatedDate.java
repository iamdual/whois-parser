package com.github.iamdual.parser.scanner;

import com.github.iamdual.templates.Template;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The updated date scanner.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class UpdatedDate extends Scanner {
    public UpdatedDate(Template template, String whoisResponse) {
        super(template, whoisResponse);
    }

    public Date getUpdatedDate() {
        if (template.getRegexUpdatedDate() == null || template.getFormatUpdatedDate() == null) {
            return null;
        }

        Pattern pattern = Pattern.compile(template.getRegexUpdatedDate());
        Matcher matcher = pattern.matcher(whoisResponse);

        if (matcher.find()) {
            try {
                SimpleDateFormat date = new SimpleDateFormat(template.getFormatUpdatedDate());
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
