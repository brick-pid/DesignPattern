package com.company;

/*
    Ticket 类是通过组合来合成 Discount 的类。Discount 策略是 Ticket 的个属性；
    Ticket 就是 Context 类。
 */

public class Ticket {
    private double price;
    private Discount discount;

    Ticket() {};
    Ticket(double p, Discount d) {
        this.price = p;
        this.discount = d;
    }

    public double getPrice() {
        return discount.calculate(this.price);
    }
}
