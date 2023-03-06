package com.company;

import java.util.ArrayList;
import java.util.List;

public class Department implements User{
    private List<User> userList = new ArrayList<>();

    @Override
    public void add(User u) {
        userList.add(u);
    }

    @Override
    public void remove(User u) {
        userList.remove(u);
    }

    @Override
    public void operation() {
        System.out.println("-- 开始通知部门 --");
        for(User u : userList) {
            u.operation();
        }
        System.out.println("-- 部门通知完毕 --");
    }

    @Override
    public User getChild(int i) {
        return userList.get(i);
    }
}
