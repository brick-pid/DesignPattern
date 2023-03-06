package com.company;

public class ValidString extends Valid{
    int max_string_size = 10;
    @Override
    public boolean validate(String s) {
        System.out.println("validate string");
        return s.length() < max_string_size;
    }
}
