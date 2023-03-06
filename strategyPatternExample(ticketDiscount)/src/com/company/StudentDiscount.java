package com.company;

/*
    StudentDiscount 实现了 Discount 接口
 */
public class StudentDiscount implements Discount{

    @Override
    public double calculate(double price) {
        return 0.8 * price;
    }
}
