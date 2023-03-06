package com.company;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat fakeCat = new Adapter(new ConcreteDog());
        fakeCat.meow(); //🐱学🐕叫

        Dog fakeDog = new Adapter(new ConcreteCat());
        fakeDog.bark(); //🐕学🐱叫
    }
}