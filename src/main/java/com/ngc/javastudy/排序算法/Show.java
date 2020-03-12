package com.ngc.javastudy.排序算法;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.排序算法
 * @date 2020/3/12 10:30 上午
 */
public class Show {
    public static void showAry(int[] i){
        for (int j:i){
            System.out.print(j+" ");
        }
        System.out.println();
    }

    public static void compare(int[] a,int[] b){
        for (int i=0;i<=a.length-1;i++){
            if (a[i] != b[i])
                System.out.println("算法有误");
        }
        System.out.println("算法无误");
    }
}
