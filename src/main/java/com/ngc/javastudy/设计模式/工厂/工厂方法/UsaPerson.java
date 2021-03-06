package com.ngc.javastudy.设计模式.工厂.工厂方法;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.工厂.工厂方法
 * @date 2020/3/6 5:01 下午
 */
public class UsaPerson extends Person{

    @Override
    public void speak() {
        System.out.println("说英文");
    }

    @Override
    public void sing() {
        System.out.println("唱英文歌");
    }

}
