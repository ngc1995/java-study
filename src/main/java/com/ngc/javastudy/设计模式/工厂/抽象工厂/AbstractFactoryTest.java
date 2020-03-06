package com.ngc.javastudy.设计模式.工厂.抽象工厂;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.工厂.抽象工厂
 * @date 2020/3/6 5:30 下午
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        //AbstractFactory cabinFactory = new CabinFactory();
        AbstractFactory cabinFactory = new VillaFactory();

        Chair chair = cabinFactory.getChair();
        Bed bed = cabinFactory.getBed();
        Table table = cabinFactory.getTable();

    }
}
