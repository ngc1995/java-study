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
    public static void main(String[] args) {
        int[] a = ArrayTest.array();
        int[] b = new int[a.length];
        System.arraycopy(a,0,b,0,a.length);

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
        Arrays.sort(b);
        Show.compare(a,b);

    }

}
