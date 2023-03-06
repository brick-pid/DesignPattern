package com.company;

public class ConcreteCat implements Cat{

    @Override
    public void catchMouse() {
        System.out.println("Catching Mouse!");
    }

    @Override
    public void meow() {
        System.out.println("Meow, Meow!");
    }
}
