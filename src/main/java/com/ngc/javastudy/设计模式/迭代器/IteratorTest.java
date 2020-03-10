package com.ngc.javastudy.设计模式.迭代器;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.迭代器
 * @date 2020/3/10 4:51 下午
 */
public class IteratorTest {

    public static void main(String[] args) {

        ListContainer<String> listContainer = new ListContainer<>();
        listContainer.add("1");
        listContainer.add("2");
        listContainer.add("3");

        System.out.println("size："+listContainer.size());

        while (listContainer.hasNext()){
            System.out.println(listContainer.next());
        }

    }
}
