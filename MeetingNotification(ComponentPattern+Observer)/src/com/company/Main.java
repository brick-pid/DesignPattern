package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MeetingList meetingList = new MeetingList();
        User e1 = new Employee(1);
        User e2 = new Employee(2);
        User e3 = new Employee(3);
        User e4 = new Employee(4);
        User e5 = new Employee(5);

        User department = new Department();
        department.add(e1);
        department.add(e2);
        department.add(e3);

        meetingList.attach(department);
        meetingList.attach(e4);
        meetingList.attach(e5);

        meetingList.notifyUsers();
    }
}
