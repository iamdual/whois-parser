package com.github.iamdual.parser;

import com.github.iamdual.parser.scanner.Availability;
import com.github.iamdual.parser.scanner.ExpiryDate;
import com.github.iamdual.parser.scanner.UpdateDate;
import com.github.iamdual.templates.Template;

import java.io.IOException;

/**
 * The main parser class.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class Parser {
    protected Template template;
    protected String whoisResponse;
    protected Result result;

    public Parser(Template template, String whoisResponse) {
        this.template = template;
        this.whoisResponse = whoisResponse;
    }

    public Result getResult() throws IOException {
        if (this.result != null) {
            return this.result;
        }

        this.result = new Result();
        this.result.setWhoisServer(template.getWhoisServer());
        this.result.setWhoisResponse(whoisResponse);

        Availability availability = new Availability(template, whoisResponse);
        this.result.setAvailable(availability.getAvailable());

        ExpiryDate expiryDate = new ExpiryDate(template, whoisResponse);
        this.result.setExpiryDate(expiryDate.getExpiryDate());

        UpdateDate updateDate = new UpdateDate(template, whoisResponse);
        this.result.setUpdateDate(updateDate.getUpdateDate());

        return this.result;
    }
}
