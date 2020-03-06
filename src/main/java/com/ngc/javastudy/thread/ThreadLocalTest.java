package com.ngc.javastudy.thread;

import java.lang.reflect.Proxy;
import java.sql.Time;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.thread
 * @date 2019-12-10 10:31
 */
public class ThreadLocalTest {

    private static AtomicInteger integer;

    public static void main(String[] args) {

        ExecutorService executorService1 = Executors.newFixedThreadPool(2);
        ExecutorService executorService = Executors.newCachedThreadPool();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,1,1000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        threadLocal.set(1);
    }
}
