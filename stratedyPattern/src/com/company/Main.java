package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Context OpAddition = new Context(new Addition());
        System.out.println(OpAddition.executeOperation(3, 4));

        Context OpMul = new Context(new Multiplication());
        System.out.println(OpMul.executeOperation(3,4));

    }
}
