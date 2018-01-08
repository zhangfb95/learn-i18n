package com.learn.i18n.i18n;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * @author zhangfb
 */
class LocaleMapper {

    private static final Map<String, Locale> INIT_LOCALE_MAP = new HashMap<>();

    static {
        INIT_LOCALE_MAP.put("zh_CN", Locale.CHINA);
        INIT_LOCALE_MAP.put("en_US", Locale.US);
    }

    static Locale getLocale(String locale) {
        Locale tmp = INIT_LOCALE_MAP.get(locale);
        if (tmp != null) {
            return tmp;
        }
        return Locale.CHINA;
    }
}
