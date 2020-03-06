package com.ngc.javastudy.设计模式.工厂.工厂方法;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.工厂.工厂方法
 * @date 2020/3/6 5:15 下午
 */
public class FactoryTest {

    public static void main(String[] args) {
        Person person = new PersonFactory().createChinaPerson();
        person.speak();
        person.sing();
        Person usaPerson = new PersonFactory().createUsaPerson();
        usaPerson.speak();
        usaPerson.sing();

    }
}
