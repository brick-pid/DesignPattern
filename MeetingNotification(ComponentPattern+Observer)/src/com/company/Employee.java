package com.company;

public class Employee implements User{
    private int id;

    public Employee(int i) {
        id = i;
    }

    @Override
    public void add(User u) {
        //handle error
    }

    @Override
    public void remove(User u) {
        //handle error

    }

    @Override
    public void operation() {
        System.out.println("员工" + id + " 收到通知！");
    }

    @Override
    public User getChild(int i) {
        //handle error
        return null;
    }
}
