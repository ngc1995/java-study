package com.ngc.javastudy.排序算法.归并排序;

import com.ngc.javastudy.排序算法.ArrayTest;
import com.ngc.javastudy.排序算法.Show;

public class Merge {

    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }
    /**
     * 递归拆分数组
     * @param a        待排序数组
     * @param leftPtr  左边界
     * @param rightPtr 右边界
     */
    public static void sort(int[] a, int leftPtr, int rightPtr) {

        //当左边界小于右边界时，包含的元素还可以继续拆分
        if (leftPtr < rightPtr) {
            int mid = (leftPtr + rightPtr) / 2;
            //以mid为界 拆分左边
            sort(a, leftPtr, mid);
            //以mid为界 拆分右边
            sort(a, mid + 1, rightPtr);

            sort(a, leftPtr, rightPtr, mid);
        }
    }


    /**
     * 将一个以mid分隔，左右两边都是有序的数组变为整体有序
     *
     * @param a        待排序数组 （以mid相隔，两边都是有序的）
     * @param leftPtr  左边界
     * @param rightPtr 右边界
     * @param mid      中间
     */
    public static void sort(int[] a, int leftPtr, int rightPtr, int mid) {

        int[] tmp = new int[rightPtr - leftPtr + 1];
        int i = leftPtr, j = mid + 1, k = 0;
        while (i <= mid && j <= rightPtr) {
            tmp[k++] = a[i] <= a[j] ? a[i++] : a[j++];
        }
        while (i <= mid) {
            tmp[k++] = a[i++];
        }
        while (j <= rightPtr) {
            tmp[k++] = a[j++];
        }
        for (int l = 0; l < tmp.length; l++) {
            a[leftPtr + l] = tmp[l];
        }
    }

}