package com.ngc.javastudy.设计模式.代理.cglib;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.代理.cglib
 * @date 2020/3/10 2:55 下午
 */
public class Man {

    public void go() {
        System.out.println("跑");
    }

    public String go(int i) {
        System.out.println("有结果的跑");
        return "跑";
    }
}
