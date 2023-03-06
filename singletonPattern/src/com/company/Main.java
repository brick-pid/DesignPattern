package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Singleton s = Singleton.getInstance();
        System.out.println(s.getVal());
    }
}
