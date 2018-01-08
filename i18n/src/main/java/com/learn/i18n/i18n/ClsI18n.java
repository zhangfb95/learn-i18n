package com.learn.i18n.i18n;

/**
 * @author zhangfb
 */
public class ClsI18n {

    public static String get(String locale, String key, Class<?> clazz) {
        return BaseI18n.get(locale, key, true, true, clazz);
    }
}
