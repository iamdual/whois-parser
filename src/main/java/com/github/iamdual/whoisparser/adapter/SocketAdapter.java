package com.github.iamdual.whoisparser.adapter;

import com.github.iamdual.whoisparser.templates.Template;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;

/**
 * The socket adapter.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class SocketAdapter extends Adapter {

    private static final String CRLF = "\r\n";

    public SocketAdapter(Template template) {
        super(template);
    }

    public String getWhoisResponse() throws IOException {
        if (response != null) {
            return response;
        }

        Socket socket;
        if (proxy != null && proxy.type() == Proxy.Type.SOCKS) {
            socket = new Socket(proxy);
        } else {
            socket = new Socket();
        }

        if (timeout != null) {
            socket.connect(new InetSocketAddress(template.getWhoisAddress(), 43), timeout);
            socket.setSoTimeout(timeout);
        } else {
            socket.connect(new InetSocketAddress(template.getWhoisAddress(), 43));
        }

        OutputStreamWriter streamWriter = new OutputStreamWriter(socket.getOutputStream());
        streamWriter.write(getFormatted(template.getQueryFormat()) + CRLF);
        streamWriter.flush();

        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        StringBuilder stringBuilder = new StringBuilder();
        try (Reader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            int c;
            while ((c = reader.read()) != -1) {
                stringBuilder.append((char) c);
            }
        }
        response = stringBuilder.toString();

        socket.close();
        streamWriter.close();
        inputStream.close();

        if (response.length() == 0) {
            throw new IOException("WHOIS response is empty.");
        }

        return response;
    }
}
