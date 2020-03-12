package com.ngc.javastudy.排序算法.冒泡排序;

import com.ngc.javastudy.排序算法.ArrayTest;
import com.ngc.javastudy.排序算法.Show;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.排序算法.冒泡排序
 * @date 2020/3/12 10:29 上午
 */
public class Bubble {
    public static void main(String[] args) {
        int[] a = ArrayTest.array;
        int min;
        Show.showAry(a);
        for (int i=1 ; i<= a.length-1 ; i++){
            for (int j=1 ; j<=a.length-i ; j++){
                if (a[j]<a[j-1]){
                    min = a[j];
                    a[j] = a[j-1];
                    a[j-1] = min;
                }
            }
        }
        Show.showAry(a);
    }
}
