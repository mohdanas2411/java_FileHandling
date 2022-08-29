package com.company;

public class Singleton {
    private static Singleton obj;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (obj == null) {
            return new Singleton();
        } else return obj;
    }
    
}
