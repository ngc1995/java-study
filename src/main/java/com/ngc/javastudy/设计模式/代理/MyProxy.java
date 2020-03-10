package com.ngc.javastudy.设计模式.代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.组合
 * @date 2020/3/10 10:29 上午
 */
public class MyProxy implements InvocationHandler {

    private Object object;

    public Object getProxyInstance(Object o){
        this.object = o;
        /**
         * newProxyInstance方法三个参数
         * 1.代理类的类加载器
         * 2.要实现代理类的哪些接口
         * 3.将方法的调用指派给哪个处理器（invoke）
         */
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法调用前处理");
        Object invoke = method.invoke(object, args);
        System.out.println("方法调用后处理");
        return invoke;
    }
}
