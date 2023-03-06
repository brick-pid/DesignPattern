package com.company;

/*
    VIPDiscount 实现了 Discount 接口
 */
public class VIPDiscount implements Discount{
    @Override
    public double calculate(double price) {
        return 0.5 * price;
    }
}
