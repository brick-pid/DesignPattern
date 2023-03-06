package com.company;

public class Adapter implements Cat, Dog{
    private Cat cat;
    private Dog dog;
    Adapter(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }
    Adapter(Cat cat) {
        this.cat = cat;
    }
    Adapter(Dog dog) {
        this.dog = dog;
    }
    @Override
    public void catchMouse() {
        this.cat.catchMouse();
    }

    @Override
    public void meow() {
        this.dog.bark();
    }

    @Override
    public void bark() {
        this.cat.meow();
    }
}
