package com.ngc.javastudy.设计模式.工厂.工厂方法;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.工厂.工厂方法
 * @date 2020/3/6 4:54 下午
 */
public class PersonFactory {

    public Person createChinaPerson(){
        return new ChinaPerson();
    }
    public Person createUsaPerson(){
        return new UsaPerson();
    }

}
