package com.ngc.javastudy.设计模式.装饰器;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.装饰器
 * @date 2020/3/9 11:29 上午
 */
public class DecoratorTest {
    public static void main(String[] args) {

        CarDecorator car = new CarDecoratorImpl(new Car1());
        car.go();

    }
}
