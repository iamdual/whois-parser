package com.github.iamdual.adapter;

import com.github.iamdual.templates.Template;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * The HTTP adapter.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class HTTP extends Adapter {

    public HTTP(Template template) {
        super(template);
    }

    public String getWhoisResponse() throws IOException {
        if (this.response != null) {
            return this.response;
        }

        String requestURL = template.getWhoisAddress();
        String queryFormat = template.getQueryFormat();

        if (queryFormat != null) {
            queryFormat = String.format(template.getQueryFormat(), domain);
        }

        if (template.getHTTPMethod().equals("GET")) {
            requestURL += queryFormat;
        }

        HttpURLConnection httpConnection = (HttpURLConnection) new URL(requestURL).openConnection();
        httpConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
        httpConnection.setRequestProperty("Referer", requestURL);

        if (!template.getHTTPMethod().equals("GET")) {
            httpConnection.setDoOutput(true);
            httpConnection.setRequestMethod(template.getHTTPMethod());
            httpConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            if (queryFormat != null) {
                try (OutputStream output = httpConnection.getOutputStream()) {
                    output.write(queryFormat.getBytes());
                }
            }
        }

        InputStream inputStream = httpConnection.getInputStream();

        StringBuilder stringBuilder = new StringBuilder();
        try (Reader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            int c;
            while ((c = reader.read()) != -1) {
                stringBuilder.append((char) c);
            }
        }

        this.response = stringBuilder.toString();

        if (this.response.length() == 0) {
            throw new IOException("WHOIS response is empty.");
        }

        return this.response;
    }
}
