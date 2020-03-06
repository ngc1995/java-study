package com.ngc.javastudy.设计模式.单例;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.单例
 * @date 2020/3/5 4:08 下午
 */
/**
   内部类
 */
public class Singleton03 {

    private Singleton03(){}

    private static class Sinfleton03Inst{
        private static final Singleton03 INSTANCE = new Singleton03();
    }

    public static Singleton03 getInstance(){
        return Sinfleton03Inst.INSTANCE;
    }

}
