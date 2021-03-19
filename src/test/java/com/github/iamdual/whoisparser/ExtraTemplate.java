package com.github.iamdual.whoisparser;

import com.github.iamdual.whoisparser.adapter.Adapter;
import com.github.iamdual.whoisparser.templates.DefaultTemplate;
import com.github.iamdual.whoisparser.templates.Template;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExtraTemplate {
    public static Map<String, Class<? extends Template>> getTemplates() {
        Map<String, Class<? extends Template>> tlds = new LinkedHashMap<>();
        tlds.put("ekin", DotEkin.class);
        return tlds;
    }

    public static class DotEkin extends DefaultTemplate {

        @Override
        public Adapter.Type getAdapterType() {
            return Adapter.Type.HTTP;
        }

        @Override
        public String getWhoisAddress() {
            return "https://gist.githubusercontent.com/iamdual/c220c7a7174eb8ab853c2338453ca400/raw/";
        }

        @Override
        public String getQueryFormat() {
            return "7a3431468a136e0b1ed64f198608a9d225273da6/%s";
        }

        @Override
        public String getHTTPMethod() {
            return "GET";
        }

        @Override
        public String getHTTPContentType() {
            return "text/plain";
        }

        @Override
        public String getRegexAvailable() {
            return "The domain \".+\" is not registered\\.";
        }

        @Override
        public String getRegexExpiryDate() {
            return "Expired Date\\s+:\\s+([0-9A-Z\\-:]+)";
        }

        @Override
        public String getFormatExpiryDate() {
            return "yyyy-MM-dd'T'HH:mm:ss'Z'";
        }

        @Override
        public String getRegexUpdatedDate() {
            return "Updated Date\\s+:\\s+([0-9A-Z\\-:]+)";
        }

        @Override
        public String getFormatUpdatedDate() {
            return "yyyy-MM-dd'T'HH:mm:ss'Z'";
        }
    }
}
