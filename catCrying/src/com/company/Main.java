package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat cat = new Cat();
        cat.attach(new Mouse());
        cat.attach(new Master());
        cat.notifyObservers();
    }
}

interface Subject{
    public void attach(Observer ob);
    public void detach(Observer ob);
    public void notifyObservers();
}

class Cat implements Subject {
    private List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void attach(Observer ob) {
        observerList.add(ob);
    }

    @Override
    public void detach(Observer ob) {
        observerList.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for(Observer ob : observerList) {
            ob.update();
        }
    }
}

interface Observer {
    public void update();
}

class Mouse implements Observer {

    @Override
    public void update() {
        System.out.println("Mouse Running!");
    }
}

class Master implements  Observer {

    @Override
    public void update() {
        System.out.println("Master Wake Up!");
    }
}



