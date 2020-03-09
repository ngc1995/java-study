package com.ngc.javastudy.设计模式.装饰器;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.装饰器
 * @date 2020/3/9 11:33 上午
 */
public class CarDecoratorImpl extends CarDecorator {

    CarDecoratorImpl(Car car){
        super(car);
    }

    @Override
    void go() {
        decorator();
        car.go();
    }

    void decorator(){
        System.out.println("加满油");
    }
}
