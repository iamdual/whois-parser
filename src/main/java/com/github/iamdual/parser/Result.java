package com.github.iamdual.parser;

import java.util.Date;

/**
 * The result object of parser.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class Result {
    protected String whoisServer;
    protected String whoisResponse;
    protected Boolean isAvailable;
    protected Date expiryDate;
    protected Date updateDate;

    public String getWhoisServer() {
        return whoisServer;
    }

    public void setWhoisServer(String whoisServer) {
        this.whoisServer = whoisServer;
    }

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

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}
