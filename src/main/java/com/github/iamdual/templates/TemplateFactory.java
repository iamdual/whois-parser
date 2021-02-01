package com.github.iamdual.templates;

import com.github.iamdual.Utils;
import com.github.iamdual.exceptions.InvalidDomainException;
import com.github.iamdual.exceptions.UnsupportedTldException;
import com.github.iamdual.templates.registrar.Afilias;
import com.github.iamdual.templates.registrar.Google;
import com.github.iamdual.templates.registrar.Verisign;
import com.github.iamdual.templates.tld.*;

/**
 * The factory of template for WHOIS patterns.
 *
 * @author: Ekin Karadeniz <iamdual@protonmail.com>
 * @license: Apache-2.0 License
 */

public class TemplateFactory {
    public Template getTemplate(String domain) throws UnsupportedTldException, InvalidDomainException {
        String tld = Utils.getDomainTld(domain);

        switch (tld) {
            case "com":
            case "net":
                return new Verisign();
            case "org":
                return new DotOrg();
            case "app":
            case "dev":
            case "page":
            case "new":
            case "how":
            case "soy":
                return new Google();
            case "info":
            case "mobi":
            case "pro":
            case "bet":
                return new Afilias();
            case "uk":
                return new DotUk();
            case "ca":
                return new DotCa();
            case "us":
                return new DotUs();
            case "kr":
                return new DotKr();
            case "jp":
                return new DotJp();
            case "cn":
                return new DotCn();
            case "hk":
                return new DotHk();
            case "ru":
                return new DotRu();
            case "de":
                return new DotDe();
            case "fr":
                return new DotFr();
            case "io":
                return new DotIo();
            case "co":
                return new DotCo();
            case "me":
                return new DotMe();
            case "biz":
                return new DotBiz();
            case "tv":
                return new DotTv();
            case "cc":
                return new DotCc();
            case "in":
                return new DotIn();
            case "fm":
                return new DotFm();
            case "sk":
                return new DotSk();
            case "cz":
                return new DotCz();
            case "it":
                return new DotIt();
            case "il":
                return new DotIl();
            case "tr":
                return new DotTr();
            case "jobs":
                return new DotJobs();
            case "company":
                return new DotCompany();
            case "digital":
                return new DotDigital();
            case "capital":
                return new DotCapital();
            case "guru":
                return new DotGuru();
            case "shoes":
                return new DotShoes();
            case "services":
                return new DotServices();
            case "clothing":
                return new DotClothing();
            case "news":
                return new DotNews();
            case "media":
                return new DotMedia();
            case "market":
                return new DotMarket();
            case "zone":
                return new DotZone();
            case "xyz":
                return new DotXyz();
            case "online":
                return new DotOnline();
            case "tech":
                return new DotTech();
            case "store":
                return new DotStore();
            case "site":
                return new DotSite();
            case "shop":
                return new DotShop();
            case "blog":
                return new DotBlog();
            default:
                throw new UnsupportedTldException(tld);
        }
    }
}
