package com.ngc.javastudy.设计模式.单例;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.单例
 * @date 2020/3/5 4:08 下午
 */
/**
   枚举
 */
public class Singleton04 {

    private enum Singleton04Inst{
        INSTANCE;
        private Singleton04 singleton04;
        Singleton04Inst(){
            singleton04 = new Singleton04();
        }
        private Singleton04 getInstance(){
            return singleton04;
        }
    }

    private Singleton04(){}

    public static Singleton04 getInstance(){
        return Singleton04Inst.INSTANCE.getInstance();
    }
}
