package com.github.iamdual.templates;

import com.github.iamdual.exceptions.UnsupportedTldException;
import com.github.iamdual.templates.registrar.*;
import com.github.iamdual.templates.tld.*;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The factory of template for WHOIS patterns.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class TemplateFactory {
    private static final Map<String, Class<? extends Template>> tmpl = new LinkedHashMap<>();

    static {
        tmpl.put("ai", DotAi.class);
        tmpl.put("ar", DotAr.class);
        tmpl.put("at", DotAt.class);
        tmpl.put("au", DotAu.class);
        tmpl.put("be", DotBe.class);
        tmpl.put("bid", DotBid.class);
        tmpl.put("biz", DotBiz.class);
        tmpl.put("br", DotBr.class);
        tmpl.put("buzz", DotBuzz.class);
        tmpl.put("ca", DotCa.class);
        tmpl.put("cat", DotCat.class);
        tmpl.put("cc", DotCc.class);
        tmpl.put("club", DotClub.class);
        tmpl.put("cn", DotCn.class);
        tmpl.put("co", DotCo.class);
        tmpl.put("com", Verisign.class);
        tmpl.put("cz", DotCz.class);
        tmpl.put("de", DotDe.class);
        tmpl.put("dk", DotDk.class);
        tmpl.put("eu", DotEu.class);
        tmpl.put("fm", DotFm.class);
        tmpl.put("fr", DotFr.class);
        tmpl.put("hk", DotHk.class);
        tmpl.put("hu", DotHu.class);
        tmpl.put("id", DotId.class);
        tmpl.put("ie", DotIe.class);
        tmpl.put("il", DotIl.class);
        tmpl.put("in", DotIn.class);
        tmpl.put("im", DotIm.class);
        tmpl.put("int", DotInt.class);
        tmpl.put("io", DotIo.class);
        tmpl.put("ir", DotIr.class);
        tmpl.put("it", DotIt.class);
        tmpl.put("jobs", DotJobs.class);
        tmpl.put("jp", DotJp.class);
        tmpl.put("kr", DotKr.class);
        tmpl.put("ma", DotMa.class);
        tmpl.put("me", DotMe.class);
        tmpl.put("name", DotName.class);
        tmpl.put("net", Verisign.class);
        tmpl.put("nl", DotNl.class);
        tmpl.put("no", DotNo.class);
        tmpl.put("nz", DotNz.class);
        tmpl.put("one", DotOne.class);
        tmpl.put("org", DotOrg.class);
        tmpl.put("party", DotParty.class);
        tmpl.put("pl", DotPl.class);
        tmpl.put("pt", DotPt.class);
        tmpl.put("pw", DotPw.class);
        tmpl.put("ru", DotRu.class);
        tmpl.put("se", DotSe.class);
        tmpl.put("sh", DotSh.class);
        tmpl.put("shop", DotShop.class);
        tmpl.put("sk", DotSk.class);
        tmpl.put("soy", Google.class);
        tmpl.put("su", DotRu.class);
        tmpl.put("st", DotSt.class);
        tmpl.put("th", DotTh.class);
        tmpl.put("tr", DotTr.class);
        tmpl.put("trade", DotTrade.class);
        tmpl.put("tv", DotTv.class);
        tmpl.put("tw", DotTw.class);
        tmpl.put("ua", DotUa.class);
        tmpl.put("uk", DotUk.class);
        tmpl.put("us", DotUs.class);
        tmpl.put("vip", DotVip.class);
        tmpl.put("wang", DotWang.class);
        tmpl.put("work", DotWork.class);
        tmpl.put("ws", DotWs.class);

        // Afilias domains
        tmpl.put("bet", Afilias.class);
        tmpl.put("info", Afilias.class);
        tmpl.put("mobi", Afilias.class);
        tmpl.put("pro", Afilias.class);

        // Afilias GRS domains
        tmpl.put("bz", AfiliasGrs.class);
        tmpl.put("lc", AfiliasGrs.class);
        tmpl.put("sc", AfiliasGrs.class);
        tmpl.put("vc", AfiliasGrs.class);

        // Google domains
        tmpl.put("app", Google.class);
        tmpl.put("dev", Google.class);
        tmpl.put("how", Google.class);
        tmpl.put("new", Google.class);
        tmpl.put("page", Google.class);
        tmpl.put("xn--q9jyb4c", Google.class);

        // CentralNic domains (Auto-generated list)
        tmpl.put("art", CentralNic.class);
        tmpl.put("baby", CentralNic.class);
        tmpl.put("bar", CentralNic.class);
        tmpl.put("basketball", CentralNic.class);
        tmpl.put("best", CentralNic.class);
        tmpl.put("blog", CentralNic.class);
        tmpl.put("bond", CentralNic.class);
        tmpl.put("cam", CentralNic.class);
        tmpl.put("ceo", CentralNic.class);
        tmpl.put("college", CentralNic.class);
        tmpl.put("coop", CentralNic.class);
        tmpl.put("desi", CentralNic.class);
        tmpl.put("design", CentralNic.class);
        tmpl.put("fans", CentralNic.class);
        tmpl.put("feedback", CentralNic.class);
        tmpl.put("forum", CentralNic.class);
        tmpl.put("frl", CentralNic.class);
        tmpl.put("fun", CentralNic.class);
        tmpl.put("gay", CentralNic.class);
        tmpl.put("gent", CentralNic.class);
        tmpl.put("host", CentralNic.class);
        tmpl.put("icu", CentralNic.class);
        tmpl.put("ink", CentralNic.class);
        tmpl.put("kred", CentralNic.class);
        tmpl.put("love", CentralNic.class);
        tmpl.put("monster", CentralNic.class);
        tmpl.put("observer", CentralNic.class);
        tmpl.put("online", CentralNic.class);
        tmpl.put("ooo", CentralNic.class);
        tmpl.put("pid", CentralNic.class);
        tmpl.put("press", CentralNic.class);
        tmpl.put("protection", CentralNic.class);
        tmpl.put("realty", CentralNic.class);
        tmpl.put("reit", CentralNic.class);
        tmpl.put("rent", CentralNic.class);
        tmpl.put("rest", CentralNic.class);
        tmpl.put("rugby", CentralNic.class);
        tmpl.put("saarland", CentralNic.class);
        tmpl.put("security", CentralNic.class);
        tmpl.put("site", CentralNic.class);
        tmpl.put("space", CentralNic.class);
        tmpl.put("storage", CentralNic.class);
        tmpl.put("store", CentralNic.class);
        tmpl.put("tech", CentralNic.class);
        tmpl.put("theatre", CentralNic.class);
        tmpl.put("tickets", CentralNic.class);
        tmpl.put("website", CentralNic.class);
        tmpl.put("wiki", CentralNic.class);
        tmpl.put("xyz", CentralNic.class);

        // Uniregistry domains (Auto-generated list)
        tmpl.put("audio", Uniregistry.class);
        tmpl.put("blackfriday", Uniregistry.class);
        tmpl.put("christmas", Uniregistry.class);
        tmpl.put("click", Uniregistry.class);
        tmpl.put("country", Uniregistry.class);
        tmpl.put("diet", Uniregistry.class);
        tmpl.put("flowers", Uniregistry.class);
        tmpl.put("game", Uniregistry.class);
        tmpl.put("gift", Uniregistry.class);
        tmpl.put("guitars", Uniregistry.class);
        tmpl.put("help", Uniregistry.class);
        tmpl.put("hiphop", Uniregistry.class);
        tmpl.put("hiv", Uniregistry.class);
        tmpl.put("hosting", Uniregistry.class);
        tmpl.put("juegos", Uniregistry.class);
        tmpl.put("link", Uniregistry.class);
        tmpl.put("llp", Uniregistry.class);
        tmpl.put("lol", Uniregistry.class);
        tmpl.put("mom", Uniregistry.class);
        tmpl.put("photo", Uniregistry.class);
        tmpl.put("pics", Uniregistry.class);
        tmpl.put("property", Uniregistry.class);
        tmpl.put("sexy", Uniregistry.class);
        tmpl.put("tattoo", Uniregistry.class);
        tmpl.put("trust", Uniregistry.class);

        // Donuts domains (Auto-generated list)
        tmpl.put("academy", Donuts.class);
        tmpl.put("accountants", Donuts.class);
        tmpl.put("actor", Donuts.class);
        tmpl.put("agency", Donuts.class);
        tmpl.put("airforce", Donuts.class);
        tmpl.put("apartments", Donuts.class);
        tmpl.put("army", Donuts.class);
        tmpl.put("associates", Donuts.class);
        tmpl.put("attorney", Donuts.class);
        tmpl.put("auction", Donuts.class);
        tmpl.put("band", Donuts.class);
        tmpl.put("bargains", Donuts.class);
        tmpl.put("bike", Donuts.class);
        tmpl.put("bingo", Donuts.class);
        tmpl.put("boutique", Donuts.class);
        tmpl.put("builders", Donuts.class);
        tmpl.put("business", Donuts.class);
        tmpl.put("cab", Donuts.class);
        tmpl.put("cafe", Donuts.class);
        tmpl.put("camera", Donuts.class);
        tmpl.put("camp", Donuts.class);
        tmpl.put("capital", Donuts.class);
        tmpl.put("cards", Donuts.class);
        tmpl.put("care", Donuts.class);
        tmpl.put("careers", Donuts.class);
        tmpl.put("cash", Donuts.class);
        tmpl.put("casino", Donuts.class);
        tmpl.put("catering", Donuts.class);
        tmpl.put("center", Donuts.class);
        tmpl.put("charity", Donuts.class);
        tmpl.put("chat", Donuts.class);
        tmpl.put("cheap", Donuts.class);
        tmpl.put("church", Donuts.class);
        tmpl.put("city", Donuts.class);
        tmpl.put("claims", Donuts.class);
        tmpl.put("cleaning", Donuts.class);
        tmpl.put("clinic", Donuts.class);
        tmpl.put("clothing", Donuts.class);
        tmpl.put("coach", Donuts.class);
        tmpl.put("codes", Donuts.class);
        tmpl.put("coffee", Donuts.class);
        tmpl.put("community", Donuts.class);
        tmpl.put("company", Donuts.class);
        tmpl.put("computer", Donuts.class);
        tmpl.put("condos", Donuts.class);
        tmpl.put("construction", Donuts.class);
        tmpl.put("contact", Donuts.class);
        tmpl.put("contractors", Donuts.class);
        tmpl.put("cool", Donuts.class);
        tmpl.put("coupons", Donuts.class);
        tmpl.put("credit", Donuts.class);
        tmpl.put("creditcard", Donuts.class);
        tmpl.put("cruises", Donuts.class);
        tmpl.put("dance", Donuts.class);
        tmpl.put("dating", Donuts.class);
        tmpl.put("deals", Donuts.class);
        tmpl.put("degree", Donuts.class);
        tmpl.put("delivery", Donuts.class);
        tmpl.put("democrat", Donuts.class);
        tmpl.put("dental", Donuts.class);
        tmpl.put("dentist", Donuts.class);
        tmpl.put("diamonds", Donuts.class);
        tmpl.put("digital", Donuts.class);
        tmpl.put("direct", Donuts.class);
        tmpl.put("directory", Donuts.class);
        tmpl.put("discount", Donuts.class);
        tmpl.put("doctor", Donuts.class);
        tmpl.put("dog", Donuts.class);
        tmpl.put("domains", Donuts.class);
        tmpl.put("education", Donuts.class);
        tmpl.put("email", Donuts.class);
        tmpl.put("energy", Donuts.class);
        tmpl.put("engineer", Donuts.class);
        tmpl.put("engineering", Donuts.class);
        tmpl.put("enterprises", Donuts.class);
        tmpl.put("equipment", Donuts.class);
        tmpl.put("estate", Donuts.class);
        tmpl.put("events", Donuts.class);
        tmpl.put("exchange", Donuts.class);
        tmpl.put("expert", Donuts.class);
        tmpl.put("exposed", Donuts.class);
        tmpl.put("express", Donuts.class);
        tmpl.put("fail", Donuts.class);
        tmpl.put("family", Donuts.class);
        tmpl.put("fan", Donuts.class);
        tmpl.put("farm", Donuts.class);
        tmpl.put("finance", Donuts.class);
        tmpl.put("financial", Donuts.class);
        tmpl.put("fish", Donuts.class);
        tmpl.put("fitness", Donuts.class);
        tmpl.put("flights", Donuts.class);
        tmpl.put("florist", Donuts.class);
        tmpl.put("football", Donuts.class);
        tmpl.put("forsale", Donuts.class);
        tmpl.put("foundation", Donuts.class);
        tmpl.put("fund", Donuts.class);
        tmpl.put("furniture", Donuts.class);
        tmpl.put("futbol", Donuts.class);
        tmpl.put("fyi", Donuts.class);
        tmpl.put("gallery", Donuts.class);
        tmpl.put("games", Donuts.class);
        tmpl.put("gifts", Donuts.class);
        tmpl.put("gives", Donuts.class);
        tmpl.put("glass", Donuts.class);
        tmpl.put("gmbh", Donuts.class);
        tmpl.put("gold", Donuts.class);
        tmpl.put("golf", Donuts.class);
        tmpl.put("graphics", Donuts.class);
        tmpl.put("gratis", Donuts.class);
        tmpl.put("gripe", Donuts.class);
        tmpl.put("group", Donuts.class);
        tmpl.put("guide", Donuts.class);
        tmpl.put("guru", Donuts.class);
        tmpl.put("haus", Donuts.class);
        tmpl.put("healthcare", Donuts.class);
        tmpl.put("hockey", Donuts.class);
        tmpl.put("holdings", Donuts.class);
        tmpl.put("holiday", Donuts.class);
        tmpl.put("hospital", Donuts.class);
        tmpl.put("house", Donuts.class);
        tmpl.put("immo", Donuts.class);
        tmpl.put("immobilien", Donuts.class);
        tmpl.put("industries", Donuts.class);
        tmpl.put("institute", Donuts.class);
        tmpl.put("insure", Donuts.class);
        tmpl.put("international", Donuts.class);
        tmpl.put("investments", Donuts.class);
        tmpl.put("irish", Donuts.class);
        tmpl.put("jetzt", Donuts.class);
        tmpl.put("jewelry", Donuts.class);
        tmpl.put("kaufen", Donuts.class);
        tmpl.put("kitchen", Donuts.class);
        tmpl.put("land", Donuts.class);
        tmpl.put("lawyer", Donuts.class);
        tmpl.put("lease", Donuts.class);
        tmpl.put("legal", Donuts.class);
        tmpl.put("life", Donuts.class);
        tmpl.put("lighting", Donuts.class);
        tmpl.put("limited", Donuts.class);
        tmpl.put("limo", Donuts.class);
        tmpl.put("live", Donuts.class);
        tmpl.put("loans", Donuts.class);
        tmpl.put("ltd", Donuts.class);
        tmpl.put("maison", Donuts.class);
        tmpl.put("management", Donuts.class);
        tmpl.put("market", Donuts.class);
        tmpl.put("marketing", Donuts.class);
        tmpl.put("mba", Donuts.class);
        tmpl.put("media", Donuts.class);
        tmpl.put("memorial", Donuts.class);
        tmpl.put("moda", Donuts.class);
        tmpl.put("money", Donuts.class);
        tmpl.put("mortgage", Donuts.class);
        tmpl.put("movie", Donuts.class);
        tmpl.put("navy", Donuts.class);
        tmpl.put("network", Donuts.class);
        tmpl.put("news", Donuts.class);
        tmpl.put("ninja", Donuts.class);
        tmpl.put("partners", Donuts.class);
        tmpl.put("parts", Donuts.class);
        tmpl.put("photography", Donuts.class);
        tmpl.put("photos", Donuts.class);
        tmpl.put("pictures", Donuts.class);
        tmpl.put("pizza", Donuts.class);
        tmpl.put("place", Donuts.class);
        tmpl.put("plumbing", Donuts.class);
        tmpl.put("plus", Donuts.class);
        tmpl.put("productions", Donuts.class);
        tmpl.put("properties", Donuts.class);
        tmpl.put("pub", Donuts.class);
        tmpl.put("recipes", Donuts.class);
        tmpl.put("rehab", Donuts.class);
        tmpl.put("reise", Donuts.class);
        tmpl.put("reisen", Donuts.class);
        tmpl.put("rentals", Donuts.class);
        tmpl.put("repair", Donuts.class);
        tmpl.put("report", Donuts.class);
        tmpl.put("republican", Donuts.class);
        tmpl.put("restaurant", Donuts.class);
        tmpl.put("reviews", Donuts.class);
        tmpl.put("rip", Donuts.class);
        tmpl.put("rocks", Donuts.class);
        tmpl.put("run", Donuts.class);
        tmpl.put("sale", Donuts.class);
        tmpl.put("salon", Donuts.class);
        tmpl.put("sarl", Donuts.class);
        tmpl.put("school", Donuts.class);
        tmpl.put("schule", Donuts.class);
        tmpl.put("services", Donuts.class);
        tmpl.put("shoes", Donuts.class);
        tmpl.put("shopping", Donuts.class);
        tmpl.put("show", Donuts.class);
        tmpl.put("singles", Donuts.class);
        tmpl.put("soccer", Donuts.class);
        tmpl.put("social", Donuts.class);
        tmpl.put("software", Donuts.class);
        tmpl.put("solar", Donuts.class);
        tmpl.put("solutions", Donuts.class);
        tmpl.put("studio", Donuts.class);
        tmpl.put("style", Donuts.class);
        tmpl.put("supplies", Donuts.class);
        tmpl.put("supply", Donuts.class);
        tmpl.put("support", Donuts.class);
        tmpl.put("surgery", Donuts.class);
        tmpl.put("systems", Donuts.class);
        tmpl.put("tax", Donuts.class);
        tmpl.put("taxi", Donuts.class);
        tmpl.put("team", Donuts.class);
        tmpl.put("technology", Donuts.class);
        tmpl.put("tennis", Donuts.class);
        tmpl.put("theater", Donuts.class);
        tmpl.put("tienda", Donuts.class);
        tmpl.put("tips", Donuts.class);
        tmpl.put("tires", Donuts.class);
        tmpl.put("today", Donuts.class);
        tmpl.put("tools", Donuts.class);
        tmpl.put("tours", Donuts.class);
        tmpl.put("town", Donuts.class);
        tmpl.put("toys", Donuts.class);
        tmpl.put("training", Donuts.class);
        tmpl.put("travel", Donuts.class);
        tmpl.put("university", Donuts.class);
        tmpl.put("vacations", Donuts.class);
        tmpl.put("ventures", Donuts.class);
        tmpl.put("vet", Donuts.class);
        tmpl.put("viajes", Donuts.class);
        tmpl.put("video", Donuts.class);
        tmpl.put("villas", Donuts.class);
        tmpl.put("vin", Donuts.class);
        tmpl.put("vision", Donuts.class);
        tmpl.put("voyage", Donuts.class);
        tmpl.put("watch", Donuts.class);
        tmpl.put("wine", Donuts.class);
        tmpl.put("works", Donuts.class);
        tmpl.put("world", Donuts.class);
        tmpl.put("wtf", Donuts.class);
        tmpl.put("zone", Donuts.class);
    }

    public Template getTemplate(String tld) throws UnsupportedTldException, IllegalAccessException {
        Class<? extends Template> tClass = tmpl.get(tld);
        if (tClass == null) {
            throw new UnsupportedTldException(tld);
        }

        try {
            return tClass.getDeclaredConstructor().newInstance();
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
            throw new IllegalAccessException();
        }
    }

    public Map<String, Class<? extends Template>> getTemplates() {
        return tmpl;
    }

    public void registerTemplate(String tld, Class<? extends Template> template) {
        tmpl.put(tld, template);
    }

    public void registerTemplates(Map<String, Class<? extends Template>> templates) {
        tmpl.putAll(templates);
    }
}