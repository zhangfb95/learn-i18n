package com.learn.i18n;

import com.learn.i18n.another.Another;
import com.learn.i18n.i18n.ClsI18n;

/**
 * @author zhangfb
 */
public class Hello {

    public void print() {
        System.out.println("this is a print function call");
    }

    public void erlang() {
        System.out.println("erlang");
    }

    public static void main(String[] args) {
        new Another().calc();
        new Hello().calc();
        new Another().calc();
        new Hello().calc();
        new Another().calc();
    }

    public void calc() {
        System.out.println("main str: " + ClsI18n.get("zh_CN", "yes", getClass()));
    }
}
