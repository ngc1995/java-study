package com.ngc.javastudy.设计模式.迭代器;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.迭代器
 * @date 2020/3/10 4:07 下午
 */

/**
 * 容器接口
 * @param <T>
 */
public interface Collection<T> {

    void add(T t);

    int size();

}
