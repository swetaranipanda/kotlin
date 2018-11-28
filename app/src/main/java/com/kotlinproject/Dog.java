package com.kotlinproject;

/**
 * Created by Swetarani Panda on 4/3/2018.
 */

public class Dog extends Animal {
    @Override
    public void speak() {
        System.out.print("bark");

    }

    public static void main(String[] dj) {
        Dog dog = new Dog();
dog.speak();
    }
}
