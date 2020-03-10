package com.ngc.javastudy.设计模式.代理;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.代理
 * @date 2020/3/10 10:38 上午
 */
public class ProxyTest {

    public static void main(String[] args) {
        Man person = new Man();
        MyProxy myProxy = new MyProxy();
        Person proxyInstance = (Person)myProxy.getProxyInstance(person);
        proxyInstance.go();
        System.out.println("------------------");
        String go = proxyInstance.go(1);
        System.out.println(go);
    }
}
