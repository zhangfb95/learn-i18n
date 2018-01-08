package com.learn.jacoco.i18n;

import java.util.ResourceBundle;

/**
 * @author zhangfb
 */
class BaseI18n {

    private static final String BASE_NAME = "mess";

    static String get(String locale, String key, boolean isPkgLevel, boolean appendClsName, Class<?> clazz) {
        String baseName = getBaseName(isPkgLevel, clazz);
        String propKey = getPropKey(key, appendClsName, clazz);
        return ResourceBundle.getBundle(baseName, LocaleMapper.getLocale(locale)).getString(propKey);
    }

    private static String getBaseName(boolean isPkgLevel, Class<?> clazz) {
        String baseName;
        if (isPkgLevel) {
            baseName = clazz.getPackage().getName() + "." + BASE_NAME;
        } else {
            baseName = BASE_NAME;
        }
        return baseName;
    }

    private static String getPropKey(String key, boolean isClassLevel, Class<?> clazz) {
        String propKey;
        if (isClassLevel) {
            propKey = clazz.getSimpleName() + "." + key;
        } else {
            propKey = key;
        }
        return propKey;
    }
}
