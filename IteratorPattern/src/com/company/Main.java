package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyList l = new MyList();
        l.append(1);
        l.append(2);
        l.append(3);
        Iterator iterator = l.iterator();
        for(iterator.first(); iterator.hasNext(); iterator.next()) {
            System.out.println(iterator.currentItem());
        }
    }
}

class MyList {
    public ArrayList<Integer> list;
    MyList() {
        list = new ArrayList<Integer>();
    }
    public Iterator iterator() {
        return new ListIterator(this);
    }
    public void append(Integer item) {
        list.add(item);
    }
}

interface Iterator {
    public void first(); // 第一个元素的位置
    public void next(); // 迭代器后移一位
    public boolean hasNext();
    public Object currentItem();
}

class ListIterator implements Iterator{
    private MyList list;
    private int cursor;
    ListIterator(MyList list) {
        this.list = list;
    }

    @Override
    public void first() {
        this.cursor = 0;
    }

    @Override
    public void next() {
        this.cursor++;
    }

    @Override
    public boolean hasNext() {
        return this.cursor < list.list.size();
    }

    @Override
    public Object currentItem() {
        return list.list.get(cursor);
    }
}
