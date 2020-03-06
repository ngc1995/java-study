package com.ngc.javastudy.设计模式.工厂.抽象工厂;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.工厂.抽象工厂
 * @date 2020/3/6 5:30 下午
 */
public abstract class AbstractFactory {

    public abstract Chair getChair();

    public abstract Table getTable();

    public abstract Bed getBed();
}
