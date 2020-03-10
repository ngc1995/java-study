package com.ngc.javastudy.设计模式.代理.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.代理.cglib
 * @date 2020/3/10 2:56 下午
 */
public class CglibProxyTest {

    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Man.class);
        enhancer.setCallback(new MyProxy());
        Man man = (Man) enhancer.create();

        man.go();
        System.out.println("-----------------");
        String go = man.go(1);
        System.out.println(go);

    }
}
