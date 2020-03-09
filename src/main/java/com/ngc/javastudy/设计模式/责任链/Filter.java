package com.ngc.javastudy.设计模式.责任链;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.责任链
 * @date 2020/3/9 2:44 下午
 */
public interface Filter {
    boolean doFilter(String request,String response,FilterChain filterChain);
}
