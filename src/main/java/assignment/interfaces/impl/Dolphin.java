package assignment.interfaces.impl;

import assignment.interfaces.ICanSwim;

public class Dolphin implements ICanSwim {
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
