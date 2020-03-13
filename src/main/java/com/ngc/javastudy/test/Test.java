package com.ngc.javastudy.test;

import com.ngc.javastudy.排序算法.ArrayTest;
import com.ngc.javastudy.排序算法.Show;
import com.ngc.javastudy.排序算法.冒泡排序.Bubble;
import com.ngc.javastudy.排序算法.希尔排序.Shell;
import com.ngc.javastudy.排序算法.插入排序.InsertIon;
import com.ngc.javastudy.排序算法.选择排序.Selection;
import com.sun.tools.javac.util.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.test
 * @date 2020/3/10 3:52 下午
 */
public class Test {
    public static void main(String[] args) {
        int[] a = ArrayTest.array();
        int[] b = new int[a.length];
        System.arraycopy(a,0,b,0,a.length);

        Shell.sort(a);

        Show.showAry(a);
        Arrays.sort(b);
        Show.compare(a,b);
    }
}
