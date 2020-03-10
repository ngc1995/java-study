package com.ngc.javastudy.设计模式.迭代器;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.迭代器
 * @date 2020/3/10 4:03 下午
 */

/**
 * 迭代器接口
 * @param <T>
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();

}
