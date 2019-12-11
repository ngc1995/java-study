package com.ngc.javastudy.thread;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.thread
 * @date 2019-12-10 10:31
 */
public class ThreadLocalTest {
    public static void main(String[] args) {

        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        threadLocal.set(1);
    }
}
