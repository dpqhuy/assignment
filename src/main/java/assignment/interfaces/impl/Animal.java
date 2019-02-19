package assignment.interfaces.impl;

import assignment.interfaces.IAnimal;

public class Animal implements IAnimal {

    public void walk() {
        System.out.println("I am walking");
    }

    @Override
    public void sing() {
        System.out.println("I am singing");
    }
}
