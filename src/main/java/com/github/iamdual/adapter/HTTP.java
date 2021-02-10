package com.github.iamdual.adapter;

import com.github.iamdual.templates.Template;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

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

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest.Builder builder = template.getHttpRequestBuilder();
        if (template.getQueryFormat() != null) {
            builder.uri(URI.create(String.format(template.getQueryFormat(), domain)));
        }
        HttpRequest request = builder.build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (InterruptedException e) {
            throw new IOException(e.getMessage());
        }

        System.out.println(response.body());
        return response.body();
    }
}
