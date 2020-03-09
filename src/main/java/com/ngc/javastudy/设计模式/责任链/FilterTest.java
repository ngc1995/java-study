package com.ngc.javastudy.设计模式.责任链;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.责任链
 * @date 2020/3/9 2:44 下午
 */
public class FilterTest {

    public static void main(String[] args) {

        FilterChain fc = new FilterChain();
        fc.add(new Filter1())
                .add(new Filter2());
        fc.doFilter("request","response",fc);


    }
}
