package com.ngc.javastudy.排序算法.选择排序;

import com.ngc.javastudy.排序算法.ArrayTest;
import com.ngc.javastudy.排序算法.Show;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.排序算法.选择排序
 * @date 2020/3/12 9:57 上午
 */
public class Selection {
    public static void sort(int[] a) {

        int t;
        for (int i=0; i<= a.length-1; i++){
            int min = i;
            for (int j = i;j<=a.length-1;j++){
                if (a[j]<a[min]){
                    min = j;
                }
            }
            t = a[i];
            a[i] = a[min];
            a[min] = t;
        }
    }
}
