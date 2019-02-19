package assignment.interfaces.impl;

import assignment.interfaces.ICanFly;
import assignment.interfaces.ISay;

public class Butterfly implements ICanFly {

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
