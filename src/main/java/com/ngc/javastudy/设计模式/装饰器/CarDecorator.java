package com.ngc.javastudy.设计模式.装饰器;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.装饰器
 * @date 2020/3/9 11:26 上午
 */
public abstract class CarDecorator {

    public Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    void go(){
        car.go();
    }
}
