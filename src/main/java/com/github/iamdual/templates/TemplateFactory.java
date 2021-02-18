package com.github.iamdual.templates;

import com.github.iamdual.exceptions.UnsupportedTldException;
import com.github.iamdual.templates.registrar.Afilias;
import com.github.iamdual.templates.registrar.Google;
import com.github.iamdual.templates.registrar.Uniregistry;
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
        tmpl.put("ai", new DotAi());
        tmpl.put("app", new Google());
        tmpl.put("ar", new DotAr());
        tmpl.put("at", new DotAt());
        tmpl.put("au", new DotAu());
        tmpl.put("be", new DotBe());
        tmpl.put("best", new DotBest());
        tmpl.put("bet", new Afilias());
        tmpl.put("biz", new DotBiz());
        tmpl.put("blog", new DotBlog());
        tmpl.put("br", new DotBr());
        tmpl.put("ca", new DotCa());
        tmpl.put("capital", new DotCapital());
        tmpl.put("cc", new DotCc());
        tmpl.put("center", new DotCenter());
        tmpl.put("click", new Uniregistry());
        tmpl.put("clothing", new DotClothing());
        tmpl.put("cn", new DotCn());
        tmpl.put("co", new DotCo());
        tmpl.put("com", new Verisign());
        tmpl.put("community", new DotCommunity());
        tmpl.put("company", new DotCompany());
        tmpl.put("cz", new DotCz());
        tmpl.put("de", new DotDe());
        tmpl.put("dev", new Google());
        tmpl.put("digital", new DotDigital());
        tmpl.put("dk", new DotDk());
        tmpl.put("eu", new DotEu());
        tmpl.put("fun", new DotFun());
        tmpl.put("fm", new DotFm());
        tmpl.put("fr", new DotFr());
        tmpl.put("gift", new Uniregistry());
        tmpl.put("guru", new DotGuru());
        tmpl.put("help", new Uniregistry());
        tmpl.put("hosting", new Uniregistry());
        tmpl.put("hk", new DotHk());
        tmpl.put("how", new Google());
        tmpl.put("id", new DotId());
        tmpl.put("ie", new DotIe());
        tmpl.put("il", new DotIl());
        tmpl.put("in", new DotIn());
        tmpl.put("info", new Afilias());
        tmpl.put("int", new DotInt());
        tmpl.put("io", new DotIo());
        tmpl.put("ir", new DotIr());
        tmpl.put("it", new DotIt());
        tmpl.put("jobs", new DotJobs());
        tmpl.put("jp", new DotJp());
        tmpl.put("kr", new DotKr());
        tmpl.put("life", new DotLife());
        tmpl.put("link", new Uniregistry());
        tmpl.put("live", new DotLive());
        tmpl.put("lol", new Uniregistry());
        tmpl.put("market", new DotMarket());
        tmpl.put("me", new DotMe());
        tmpl.put("media", new DotMedia());
        tmpl.put("mobi", new Afilias());
        tmpl.put("name", new DotName());
        tmpl.put("net", new Verisign());
        tmpl.put("new", new Google());
        tmpl.put("news", new DotNews());
        tmpl.put("nl", new DotNl());
        tmpl.put("no", new DotNo());
        tmpl.put("nz", new DotNz());
        tmpl.put("one", new DotOne());
        tmpl.put("online", new DotOnline());
        tmpl.put("org", new DotOrg());
        tmpl.put("page", new Google());
        tmpl.put("party", new DotParty());
        tmpl.put("pl", new DotPl());
        tmpl.put("pro", new Afilias());
        tmpl.put("ru", new DotRu());
        tmpl.put("se", new DotSe());
        tmpl.put("services", new DotServices());
        tmpl.put("sh", new DotSh());
        tmpl.put("shoes", new DotShoes());
        tmpl.put("shop", new DotShop());
        tmpl.put("site", new DotSite());
        tmpl.put("sk", new DotSk());
        tmpl.put("soy", new Google());
        tmpl.put("store", new DotStore());
        tmpl.put("su", new DotRu());
        tmpl.put("tech", new DotTech());
        tmpl.put("th", new DotTh());
        tmpl.put("tr", new DotTr());
        tmpl.put("trade", new DotTrade());
        tmpl.put("travel", new DotTravel());
        tmpl.put("tv", new DotTv());
        tmpl.put("tw", new DotTw());
        tmpl.put("ua", new DotUa());
        tmpl.put("uk", new DotUk());
        tmpl.put("us", new DotUs());
        tmpl.put("website", new DotWebsite());
        tmpl.put("ws", new DotWs());
        tmpl.put("xyz", new DotXyz());
        tmpl.put("zone", new DotZone());
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