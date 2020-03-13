package com.ngc.javastudy.排序算法;

import java.util.Random;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.排序算法
 * @date 2020/3/12 9:55 上午
 */
public class ArrayTest {

    public static int[] array = {7,2,6,3,4,9,1,8,5};

    public static int[] array1 = new int[10000];

    public static int[] array(){
        Random random = new Random();
        for (int i=0;i<array1.length;i++){
            array1[i] = random.nextInt(10000);
        }

        return array1;
    }

}
