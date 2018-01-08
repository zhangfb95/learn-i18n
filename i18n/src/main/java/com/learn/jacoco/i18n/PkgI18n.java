package com.learn.jacoco.i18n;

/**
 * @author zhangfb
 */
public class PkgI18n {

    public static String get(String locale, String key, Class<?> clazz) {
        return BaseI18n.get(locale, key, true, false, clazz);
    }
}
