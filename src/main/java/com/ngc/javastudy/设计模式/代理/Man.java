package com.ngc.javastudy.设计模式.代理;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.代理
 * @date 2020/3/10 10:40 上午
 */
public class Man implements Person {
    @Override
    public void go() {
        System.out.println("跑");
    }

    @Override
    public String go(int i) {
        System.out.println("有结果的跑");
        return "跑";
    }
}
