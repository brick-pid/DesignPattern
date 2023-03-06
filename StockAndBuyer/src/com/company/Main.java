package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stock stock = new Stock("Nasq", 12000.0);
        stock.attach(new Buyer("Lihua"));
        stock.attach(new Buyer("Zhangsan"));
        stock.attach(new Buyer("Ming"));
        stock.setPrice(14000.0);
        stock.setPrice(13000.0);
    }
}

class Stock {
    private List<Observer> observerList = new ArrayList<Observer>();
    private String name;
    private double price;

    Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void setPrice(double newPrice) {
        if(this.price != 0 && (newPrice / this.price >= 1.05 || this.price / newPrice >= 1.05)) {
            this.price = newPrice;
            System.out.println("Start Notify New Price: " + this.price);
            notifyObservers();
        }else {
            this.price = newPrice;
        }

    }
    public void notifyObservers() {
        for(Observer observer : observerList) {
            observer.update(this.price);
        }
    }
    public void attach(Observer observer) {
        observerList.add(observer);
    }

}

interface Observer {
    public void update(double newPrice);
}

class Buyer implements Observer {
    String name;
    Buyer(String name) {
        this.name = name;
    }

    @Override
    public void update(double newPrice) {
        System.out.println("buyer " + this.name + " get notification, and knew the new price is " + newPrice);
    }
}