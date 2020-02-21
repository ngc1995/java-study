package com.ngc.javastudy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.proxy
 * @date 2020-01-13 14:41
 */
public class DynamicProxy implements InvocationHandler {

    private Object object;

    public Object newProxyInstance(Object object){
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }


    /**
     *
     * @param proxy 代理对象
     * @param method 拦截的方法
     * @param args 方法上的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("使用动态代理拦截");
        Object invoke = method.invoke(object, args);
        return invoke;
    }
}
