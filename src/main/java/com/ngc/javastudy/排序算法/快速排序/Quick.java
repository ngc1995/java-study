package com.ngc.javastudy.排序算法.快速排序;

import com.ngc.javastudy.排序算法.ArrayTest;
import com.ngc.javastudy.排序算法.Show;

public class Quick {

    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }
//    public static void sort(int[] a, int l, int r) {
//        if (l >= r)
//            return;
//
//        int i = l;
//        int j = r;
//        int key = a[l];
//
//        while (i < j) {
//
//            while (i < j && a[j] >= key)
//                j--;
//            if (i < j) {
//                a[i] = a[j];
//                i++;
//            }
//            while (i < j && a[i] < key)
//                i++;
//            if (i < j) {
//                a[j] = a[i];
//                j--;
//            }
//        }
//        //i == j
//        a[i] = key;
//        sort(a, l, i - 1);
//        sort(a, i + 1, r);
//    }
    /**
     * 默认以左边界的元素为基准元素，比它小的放在左边，比它大的放在右边（遍历时需要先从右边开始遍历）
     * @param a   待排序数组
     * @param l   左边界
     * @param r   右边界
     */
    public static void sort(int[] a, int l, int r) {
        if (l >= r)
            return;
        //以左边第一个元素为基准元素
        int k = a[l];
        int i = l, j = r;
        while (i < j) {
            //从右向左找到比k小的数
            while (i < j && a[j] >= k) {
                j--;
            }
            //从左向右找到比k大的数
            while (i < j && a[i] <= k) {
                i++;
            }
            if (i < j) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        //此时i==j，并且a[i]对应的元素一定比基准元素小
        a[l] = a[i];
        a[i] = k;
        sort(a,l,i-1);
        sort(a,i+1,r);
    }

    /**
     * 以右边界的元素为基准元素
     * @param a   待排序数组
     * @param l   左边界
     * @param r   右边界
     */
/*    public static void sort(int[] a, int l, int r) {
        if (l >= r)
            return;
        //以右边第一个元素为基准元素
        int k = a[r];
        int i = l, j = r;
        while (i < j) {
            //从左向右找到比k大的数
            while (i < j && a[i] <= k) {
                i++;
            }
            //从右向左找到比k小的数
            while (i < j && a[j] >= k) {
                j--;
            }
            if (i < j) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        //此时i==j，并且a[i]对应的元素一定比基准元素大
        a[r] = a[i];
        a[i] = k;
        sort(a,l,i-1);
        sort(a,i+1,r);
    }*/

}