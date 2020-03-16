package com.ngc.javastudy.排序算法.计数排序;

import com.ngc.javastudy.排序算法.ArrayTest;
import com.ngc.javastudy.排序算法.Show;

public class Counting {
    public static int[] sort(int[] a) {

        //分配一个新数组，新数组的最大下标就是原数组中的最大取值
        int[] b = new int[a.length+1];
        int[] c = new int[a.length];

        /**
         * 遍历原数组，将原数组中的元素存入新数组对应的下标处
         * 即 原数组中元素值对应为新数组的下标，新数组下标对应的值 +1
         */
        for (int i=0;i<a.length;i++){
            b[a[i]]++;
        }
        /**
         * 将新数组进行累加（ a[i] = a[i]+a[i-1] ）
         * 此时所得数组中保存的值 是排序后元素最后一次出现的位置
         */
        for (int i=1;i<b.length;i++){
            b[i] = b[i]+b[i-1];
        }
        /**
         * 新数组中存储了元素最后出现的位置，所以从后向前遍历，保证有序
         */
        for (int i=a.length-1;i>=0;i--){
            c[--b[a[i]]]=a[i];
        }
        return c;
    }
}