package com.ngc.javastudy.设计模式.单例;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.单例
 * @date 2020/3/5 4:08 下午
 */

import java.util.concurrent.Callable;

/**
   懒汉式
 */
public class Singleton02 {

    private static volatile Singleton02 singleton01;

    private Singleton02(){};

    public static Singleton02 getInstance(){
        if (singleton01 == null) {
            synchronized (Singleton02.class) {
                if (singleton01 == null) {
                    return singleton01 = new Singleton02();
                }
            }
        }
        return singleton01;
    }

}
