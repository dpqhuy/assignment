package assignment.interfaces.impl;

import assignment.interfaces.IBird;
import assignment.interfaces.ICanSwim;

public class Duck extends Bird implements ICanSwim {
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }

    @Override
    public void say() {
        System.out.println("Quack, quack");
    }
}
