package com.github.iamdual.templates;

import com.github.iamdual.exceptions.UnsupportedTldException;
import com.github.iamdual.templates.registrar.Afilias;
import com.github.iamdual.templates.registrar.Google;
import com.github.iamdual.templates.registrar.Verisign;
import com.github.iamdual.templates.tld.*;

import java.util.HashMap;
import java.util.Map;

/**
 * The factory of template for WHOIS patterns.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class TemplateFactory {
    private static final Map<String, Template> tmpl = new HashMap<>();

    static {
        tmpl.put("com", new Verisign());
        tmpl.put("net", new Verisign());
        tmpl.put("org", new DotOrg());
        tmpl.put("app", new Google());
        tmpl.put("dev", new Google());
        tmpl.put("page", new Google());
        tmpl.put("new", new Google());
        tmpl.put("how", new Google());
        tmpl.put("soy", new Google());
        tmpl.put("info", new Afilias());
        tmpl.put("mobi", new Afilias());
        tmpl.put("pro", new Afilias());
        tmpl.put("bet", new Afilias());
        tmpl.put("uk", new DotUk());
        tmpl.put("ca", new DotCa());
        tmpl.put("us", new DotUs());
        tmpl.put("kr", new DotKr());
        tmpl.put("jp", new DotJp());
        tmpl.put("cn", new DotCn());
        tmpl.put("hk", new DotHk());
        tmpl.put("ru", new DotRu());
        tmpl.put("de", new DotDe());
        tmpl.put("fr", new DotFr());
        tmpl.put("io", new DotIo());
        tmpl.put("co", new DotCo());
        tmpl.put("me", new DotMe());
        tmpl.put("biz", new DotBiz());
        tmpl.put("tv", new DotTv());
        tmpl.put("cc", new DotCc());
        tmpl.put("in", new DotIn());
        tmpl.put("fm", new DotFm());
        tmpl.put("sk", new DotSk());
        tmpl.put("cz", new DotCz());
        tmpl.put("it", new DotIt());
        tmpl.put("il", new DotIl());
        tmpl.put("tr", new DotTr());
        tmpl.put("jobs", new DotJobs());
        tmpl.put("company", new DotCompany());
        tmpl.put("digital", new DotDigital());
        tmpl.put("capital", new DotCapital());
        tmpl.put("guru", new DotGuru());
        tmpl.put("shoes", new DotShoes());
        tmpl.put("services", new DotServices());
        tmpl.put("clothing", new DotClothing());
        tmpl.put("news", new DotNews());
        tmpl.put("media", new DotMedia());
        tmpl.put("market", new DotMarket());
        tmpl.put("zone", new DotZone());
        tmpl.put("xyz", new DotXyz());
        tmpl.put("online", new DotOnline());
        tmpl.put("tech", new DotTech());
        tmpl.put("store", new DotStore());
        tmpl.put("site", new DotSite());
        tmpl.put("shop", new DotShop());
        tmpl.put("blog", new DotBlog());
    }

    public Template getTemplate(String tld) throws UnsupportedTldException {
        Template template = tmpl.get(tld);
        if (template != null) {
            return template;
        }
        throw new UnsupportedTldException(tld);
    }

    public Map<String, Template> getTemplates() {
        return tmpl;
    }

    public void registerTemplate(String tld, Template template) {
        tmpl.put(tld, template);
    }
}