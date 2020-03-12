package com.ngc.javastudy.排序算法.选择排序;

import com.ngc.javastudy.排序算法.ArrayTest;
import com.ngc.javastudy.排序算法.Show;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.排序算法.选择排序
 * @date 2020/3/12 9:57 上午
 */
public class Selection {
    public static void main(String[] args) {
        int[] a = ArrayTest.array;
        Show.showAry(a);
        for (int i=0; i<= a.length-1; i++){
            int min = a[i];
            for (int j = i;j<=a.length-1;j++){
                if (a[j]<min){
                    min = a[j ];
                    a[j] = a[i];
                    a[i] = min;
                }
            }
        }
        Show.showAry(a);
    }

}
