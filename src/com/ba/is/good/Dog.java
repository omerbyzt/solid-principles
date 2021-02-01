package com.ba.is.good;

public class Dog implements Runnable, Barkable {
    public void bark() {
        System.out.println("Köpek,Havlıyorum.");
        //logic
    }
    public void run() {
        System.out.println("Köpek,Koşuyorum.");
        //logic
    }
}
