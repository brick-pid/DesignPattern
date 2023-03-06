package com.company;

public class ValidDate extends Valid{

    @Override
    public boolean validate(String s) {
        System.out.println("validate Date");
        return true;
    }
}
