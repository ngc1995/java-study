package com.ngc.javastudy.test;

import com.ngc.javastudy.Dto;
import com.ngc.javastudy.entiy.Myshow;
import com.ngc.javastudy.proxy.DynamicProxy;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.test
 * @date 2020-01-13 14:47
 */
public class ProxyTest {

    public static void main(String[] args) {

        Myshow myshow = new Myshow();
        DynamicProxy dynamicProxy = new DynamicProxy();

        Dto o = (Dto) dynamicProxy.newProxyInstance(myshow);

        o.show();
        int show = o.show(1);
        System.out.println(show);



    }
}
