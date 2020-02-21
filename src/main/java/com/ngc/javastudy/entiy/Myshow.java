package com.ngc.javastudy.entiy;

import com.ngc.javastudy.Dto;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.entiy
 * @date 2020-01-13 14:46
 */
public class Myshow implements Dto {
    @Override
    public void show() {
        System.out.println("我的动态代理");
    }

    @Override
    public int show(int i) {
        System.out.println("我的动态代理"+i);
        return 0;
    }
}
