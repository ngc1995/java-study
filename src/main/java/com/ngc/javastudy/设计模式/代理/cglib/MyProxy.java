package com.ngc.javastudy.设计模式.代理.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.代理.cglib
 * @date 2020/3/10 2:56 下午
 */
public class MyProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法调用前处理");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("方法调用后处理");
        return invoke;
    }
}
