package assignment.interfaces.impl;

import assignment.interfaces.IBird;

public class Bird extends Animal implements IBird {

    public void fly() {
        System.out.println("I am flying");
    }
}
