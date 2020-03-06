package com.ngc.javastudy.设计模式.工厂.抽象工厂;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.工厂.抽象工厂
 * @date 2020/3/6 5:43 下午
 */
public class CabinFactory extends AbstractFactory {

    @Override
    public Chair getChair() {
        System.out.println("小屋的椅子");
        return new CabinChair();
    }

    @Override
    public Table getTable() {
        System.out.println("小屋的桌子");
        return new CabinTable();
    }

    @Override
    public Bed getBed() {
        System.out.println("小屋的床");
        return new CabinBed();
    }
}
