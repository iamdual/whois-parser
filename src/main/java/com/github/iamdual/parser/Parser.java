package com.github.iamdual.parser;

import com.github.iamdual.parser.scanner.Availability;
import com.github.iamdual.parser.scanner.ExpiryDate;
import com.github.iamdual.parser.scanner.UpdatedDate;
import com.github.iamdual.templates.Template;

/**
 * The main parser class.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class Parser {
    protected final Template template;
    protected final String whoisResponse;
    protected final int flags;
    protected Result result;

    public static int FLAG_AVAILABILITY = 1 << 0;
    public static int FLAG_EXPIRY_DATE = 1 << 1;
    public static int FLAG_UPDATED_DATE = 1 << 2;

    public Parser(Template template, String whoisResponse) {
        this.template = template;
        this.whoisResponse = whoisResponse;
        this.flags = FLAG_AVAILABILITY | FLAG_EXPIRY_DATE | FLAG_UPDATED_DATE;
    }

    public Parser(Template template, String whoisResponse, int flags) {
        this.template = template;
        this.whoisResponse = whoisResponse;
        this.flags = flags;
    }

    public Result getResult() {
        if (result != null) {
            return result;
        }

        result = new Result();
        result.setWhoisResponse(whoisResponse);

        if ((flags & FLAG_AVAILABILITY) == FLAG_AVAILABILITY) {
            Availability availability = new Availability(template, whoisResponse);
            result.setAvailable(availability.getAvailable());
        }

        if ((flags & FLAG_EXPIRY_DATE) == FLAG_EXPIRY_DATE) {
            ExpiryDate expiryDate = new ExpiryDate(template, whoisResponse);
            result.setExpiryDate(expiryDate.getExpiryDate());
        }

        if ((flags & FLAG_UPDATED_DATE) == FLAG_UPDATED_DATE) {
            UpdatedDate updatedDate = new UpdatedDate(template, whoisResponse);
            result.setUpdatedDate(updatedDate.getUpdatedDate());
        }

        return result;
    }
}
