package com.ngc.javastudy.设计模式.迭代器;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.迭代器
 * @date 2020/3/10 4:10 下午
 */
public class ListContainer<T> implements Iterator<T>,Collection<T> {
    private Node head;
    private Node tail;
    private Node n;
    private int size=0;
    private int i=-1;
    @Override
    public void add(T t) {
        Node n = new Node(t);
        if (head==null){
            head = n;
            tail = head;
        }

        tail.next = n;
        tail = n;

        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean hasNext() {
        if (i==-1){
            i = size;
        }
        if (i>0){
            if (n!=null)
                n = n.next;
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        if (n==null) {
            n = head;
        }
        i--;
        return (T) n.t;
    }


    private class Node<T> {

        private T t;

        private Node next;

        Node(T t){
            this.t = t;
        }
    }
}
