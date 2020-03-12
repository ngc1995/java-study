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

    public static void main(String[] args) {
        int[] a = ArrayTest.array();
        int[] b = new int[a.length];
        System.arraycopy(a,0,b,0,a.length);
        for (int i=0; i<= a.length-1; i++){
            int k = a[i];
            for (int j = 0;j<i;j++){
                if (a[j]>k){
                    k = a[j];
                    a[j] = a[i];
                    a[i] = k;
                }
            }
        }
        Arrays.sort(b);
        Show.compare(a,b);
    }

}
