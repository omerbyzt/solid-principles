package com.ba.is.good;

public class Bird implements Flyable, Runnable {
    public void run() {
        System.out.println("Kuş,Koşuyorum");
        //logic
    }
    public void fly() {
        System.out.println("Kuş,Uçuyorum.");
        //logic
    }
}