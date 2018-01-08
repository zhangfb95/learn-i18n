package com.learn.jacoco.another;

import com.learn.jacoco.i18n.ClsI18n;

/**
 * @author zhangfb
 */
public class Another {

    public void calc() {
        System.out.println("another str: " + ClsI18n.get("zh_CN", "yes", getClass()));
    }
}
