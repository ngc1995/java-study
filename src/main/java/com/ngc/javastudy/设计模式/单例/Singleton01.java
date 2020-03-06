package com.ngc.javastudy.设计模式.单例;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.单例
 * @date 2020/3/5 4:08 下午
 */
/**
   饿汉式，线程安全，因为jvm只会加载一个
   缺点：浪费内存空间
 */
public class Singleton01 {

    private static final Singleton01 singleton01 = new Singleton01();

    private Singleton01(){};

    public Singleton01 getInstance(){
        return singleton01;
    }

}
