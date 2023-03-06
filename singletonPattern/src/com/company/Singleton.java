package com.company;

public class Singleton {
    private int val;
    private static Singleton instance; // 私有实例

    private Singleton() {
        val = 1;
    }; // 私有构造方法

    public static Singleton getInstance() { //static 修饰的方法可以直接通过「类」名来访问，而不需要实例化
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getVal() {
        return val;
    }
}
