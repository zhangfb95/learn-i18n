package com.learn.i18n.i18n;

/**
 * @author zhangfb
 */
public class I18n {

    public static String get(String locale, String key) {
        return BaseI18n.get(locale, key, false, false, null);
    }
}
