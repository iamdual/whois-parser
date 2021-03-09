package com.github.iamdual.templates;

import com.github.iamdual.exceptions.UnsupportedTldException;
import com.github.iamdual.templates.registrar.*;
import com.github.iamdual.templates.tld.*;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * The factory of template for WHOIS patterns.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class TemplateFactory {
    private static final Map<String, Class<? extends Template>> tmpl = new HashMap<>();

    static {
        tmpl.put("ai", DotAi.class);
        tmpl.put("app", Google.class);
        tmpl.put("ar", DotAr.class);
        tmpl.put("at", DotAt.class);
        tmpl.put("au", DotAu.class);
        tmpl.put("be", DotBe.class);
        tmpl.put("best", DotBest.class);
        tmpl.put("bet", Afilias.class);
        tmpl.put("biz", DotBiz.class);
        tmpl.put("blog", DotBlog.class);
        tmpl.put("br", DotBr.class);
        tmpl.put("buzz", DotBuzz.class);
        tmpl.put("bz", AfiliasGrs.class);
        tmpl.put("ca", DotCa.class);
        tmpl.put("cat", DotCat.class);
        tmpl.put("capital", DotCapital.class);
        tmpl.put("cc", DotCc.class);
        tmpl.put("center", DotCenter.class);
        tmpl.put("click", Uniregistry.class);
        tmpl.put("clothing", DotClothing.class);
        tmpl.put("club", DotClub.class);
        tmpl.put("cn", DotCn.class);
        tmpl.put("co", DotCo.class);
        tmpl.put("com", Verisign.class);
        tmpl.put("community", DotCommunity.class);
        tmpl.put("company", DotCompany.class);
        tmpl.put("cz", DotCz.class);
        tmpl.put("de", DotDe.class);
        tmpl.put("dev", Google.class);
        tmpl.put("digital", DotDigital.class);
        tmpl.put("dk", DotDk.class);
        tmpl.put("eu", DotEu.class);
        tmpl.put("fun", DotFun.class);
        tmpl.put("fm", DotFm.class);
        tmpl.put("fr", DotFr.class);
        tmpl.put("gift", Uniregistry.class);
        tmpl.put("group", DotGroup.class);
        tmpl.put("guru", DotGuru.class);
        tmpl.put("help", Uniregistry.class);
        tmpl.put("hosting", Uniregistry.class);
        tmpl.put("hk", DotHk.class);
        tmpl.put("how", Google.class);
        tmpl.put("id", DotId.class);
        tmpl.put("ie", DotIe.class);
        tmpl.put("il", DotIl.class);
        tmpl.put("in", DotIn.class);
        tmpl.put("info", Afilias.class);
        tmpl.put("int", DotInt.class);
        tmpl.put("io", DotIo.class);
        tmpl.put("ir", DotIr.class);
        tmpl.put("it", DotIt.class);
        tmpl.put("jobs", DotJobs.class);
        tmpl.put("jp", DotJp.class);
        tmpl.put("kr", DotKr.class);
        tmpl.put("lc", AfiliasGrs.class);
        tmpl.put("life", DotLife.class);
        tmpl.put("link", Uniregistry.class);
        tmpl.put("live", DotLive.class);
        tmpl.put("lol", Uniregistry.class);
        tmpl.put("ma", DotMa.class);
        tmpl.put("market", DotMarket.class);
        tmpl.put("me", DotMe.class);
        tmpl.put("media", DotMedia.class);
        tmpl.put("mobi", Afilias.class);
        tmpl.put("name", DotName.class);
        tmpl.put("net", Verisign.class);
        tmpl.put("new", Google.class);
        tmpl.put("news", DotNews.class);
        tmpl.put("nl", DotNl.class);
        tmpl.put("no", DotNo.class);
        tmpl.put("nz", DotNz.class);
        tmpl.put("one", DotOne.class);
        tmpl.put("online", DotOnline.class);
        tmpl.put("org", DotOrg.class);
        tmpl.put("page", Google.class);
        tmpl.put("party", DotParty.class);
        tmpl.put("partners", DotPartners.class);
        tmpl.put("pl", DotPl.class);
        tmpl.put("pro", Afilias.class);
        tmpl.put("pw", DotPw.class);
        tmpl.put("ru", DotRu.class);
        tmpl.put("rocks", DotRocks.class);
        tmpl.put("sc", AfiliasGrs.class);
        tmpl.put("se", DotSe.class);
        tmpl.put("services", DotServices.class);
        tmpl.put("sh", DotSh.class);
        tmpl.put("shoes", DotShoes.class);
        tmpl.put("shop", DotShop.class);
        tmpl.put("site", DotSite.class);
        tmpl.put("sk", DotSk.class);
        tmpl.put("solutions", DotSolutions.class);
        tmpl.put("soy", Google.class);
        tmpl.put("store", DotStore.class);
        tmpl.put("su", DotRu.class);
        tmpl.put("tech", DotTech.class);
        tmpl.put("th", DotTh.class);
        tmpl.put("today", DotToday.class);
        tmpl.put("tr", DotTr.class);
        tmpl.put("trade", DotTrade.class);
        tmpl.put("travel", DotTravel.class);
        tmpl.put("tv", DotTv.class);
        tmpl.put("tw", DotTw.class);
        tmpl.put("ua", DotUa.class);
        tmpl.put("uk", DotUk.class);
        tmpl.put("us", DotUs.class);
        tmpl.put("vc", AfiliasGrs.class);
        tmpl.put("vip", DotVip.class);
        tmpl.put("wang", DotWang.class);
        tmpl.put("website", DotWebsite.class);
        tmpl.put("wiki", DotWiki.class);
        tmpl.put("work", DotWork.class);
        tmpl.put("ws", DotWs.class);
        tmpl.put("xyz", DotXyz.class);
        tmpl.put("zone", DotZone.class);
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
}