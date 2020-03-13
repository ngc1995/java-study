package com.ngc.javastudy.排序算法.插入排序;

import com.ngc.javastudy.排序算法.ArrayTest;
import com.ngc.javastudy.排序算法.Show;

import java.util.Arrays;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.排序算法.插入排序
 * @date 2020/3/12 10:51 上午
 */
public class InsertIon {

    public static void sort(int[] a) {
        int k;
        for (int i=1; i< a.length; i++){
            for (int j = i;j>0;j--){
                if (a[j]<a[j-1]){
                    k = a[j];
                    a[j] = a[j-1];
                    a[j-1] = k;
                }
            }
        }
    }
}
