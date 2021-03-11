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
import java.util.Map;

/**
 * A WHOIS parser library for a some of supported TLDs.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class WhoisParser {
    protected final String domain;
    protected final Integer flags;
    protected Proxy proxy;
    protected Integer timeout;
    protected Map<String, Class<? extends Template>> extraTemplates;

    public WhoisParser(String domain) {
        this.domain = domain;
        this.flags = null;
    }

    public WhoisParser(String domain, int flags) {
        this.domain = domain;
        this.flags = flags;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public void setExtraTemplates(Map<String, Class<? extends Template>> extraTemplates) {
        this.extraTemplates = extraTemplates;
    }

    public Result lookup() throws UnsupportedTldException, InvalidDomainException, InvalidAdapterException, IOException, IllegalAccessException {
        TemplateFactory templateFactory = new TemplateFactory();
        if (extraTemplates != null) {
            templateFactory.registerTemplates(extraTemplates);
        }
        Template template = templateFactory.getTemplate(Utils.getDomainTld(domain));

        AdapterFactory adapterFactory = new AdapterFactory();
        Adapter adapter = adapterFactory.getAdapter(template);
        adapter.setDomain(domain);
        adapter.setProxy(proxy);
        adapter.setTimeout(timeout);

        Parser parser;
        if (flags == null) {
            parser = new Parser(template, adapter.getWhoisResponse());
        } else {
            parser = new Parser(template, adapter.getWhoisResponse(), flags);
        }

        return parser.getResult();
    }
}
