package com.ngc.javastudy.设计模式.责任链;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.责任链
 * @date 2020/3/9 2:44 下午
 */
public class FilterChain implements Filter {

    private List<Filter> filters = new ArrayList<>();

    private Iterator<Filter> iterator;

    public FilterChain add(Filter f){
        filters.add(f);
        this.iterator = filters.iterator();
        return this;
    }

    @Override
    public boolean doFilter(String request, String response, FilterChain filterChain) {
        if (iterator.hasNext()){
            if (!iterator.next().doFilter(request,response,filterChain)){
                return true;
            }
        }
        return false;
    }
}
