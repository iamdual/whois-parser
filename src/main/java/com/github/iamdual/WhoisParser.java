package com.github.iamdual;

import com.github.iamdual.adapter.Adapter;
import com.github.iamdual.adapter.AdapterFactory;
import com.github.iamdual.exceptions.InvalidAdapterException;
import com.github.iamdual.exceptions.InvalidDomainException;
import com.github.iamdual.exceptions.UnsupportedTldException;
import com.github.iamdual.parser.Parser;
import com.github.iamdual.parser.Result;
import com.github.iamdual.templates.Template;
import com.github.iamdual.templates.TemplateFactory;

import java.io.IOException;
import java.net.Proxy;

/**
 * A WHOIS parser library for a some of supported TLDs.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class WhoisParser {
    protected String domain;
    protected Proxy proxy;

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    public Result lookup() throws UnsupportedTldException, InvalidDomainException, InvalidAdapterException, IOException {
        TemplateFactory templateFactory = new TemplateFactory();
        Template template = templateFactory.getTemplate(domain);
        AdapterFactory adapterFactory = new AdapterFactory();
        Adapter adapter = adapterFactory.getAdapter(template.getAdapterType());
        adapter.setWhoisServer(template.getWhoisServer());
        adapter.setDomain(domain);
        adapter.setProxy(proxy);
        Parser parser = new Parser(template, adapter.getWhoisResponse());
        return parser.getResult();
    }
}
