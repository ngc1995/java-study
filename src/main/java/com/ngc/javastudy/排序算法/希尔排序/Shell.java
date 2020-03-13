package com.ngc.javastudy.排序算法.希尔排序;

public class Shell {
    public static void sort(int[] a) {

        int min;
        int k=1;
        while (k<=a.length/3){
            k = 3*k+1;
        }
        while (true) {
            for (int i=k ; i<a.length ; i++){
                for (int j=i ; j>k-1 ; j-=k){
                    if (a[j]<a[j-k]){
                        min = a[j-k];
                        a[j-k] = a[j];
                        a[j] = min;
                    }
                }
            }
            if (k == 1)
                break;
            k = (k-1) / 3;
        }
    }
}