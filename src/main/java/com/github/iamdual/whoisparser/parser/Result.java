package com.github.iamdual.whoisparser.parser;

import java.util.Date;

/**
 * The result object of parser.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class Result {
    protected String whoisResponse;
    protected Boolean isAvailable;
    protected Date expiryDate;
    protected Date updatedDate;

    public String getWhoisResponse() {
        return whoisResponse;
    }

    public void setWhoisResponse(String response) {
        this.whoisResponse = response;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

}
