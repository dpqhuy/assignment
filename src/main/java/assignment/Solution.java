package assignment;

import assignment.interfaces.ICanFly;
import assignment.interfaces.ICanSing;
import assignment.interfaces.ICanSwim;
import assignment.interfaces.ICanWalk;
import assignment.interfaces.impl.*;

import java.util.Arrays;

public class Solution {
    public static void counting(Object[] array) {
        int fly = 0;
        int walk = 0;
        int swim = 0;
        int sing = 0;

        for (Object o : array) {
            if (o instanceof ICanFly) {
                fly++;
            }
            if (o instanceof ICanWalk) {
                walk++;
            }
            if (o instanceof ICanSwim) {
                swim++;
            }
            if (o instanceof ICanSing) {
                sing++;
            }
        }

        String format = String.format("fly=%d\nwalk=%d\nswim=%d\nsing=%d", fly, walk, swim, sing);

        System.out.println(format);

    }

    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.walk();
//        bird.fly();
//        bird.sing();
        counting(new Object[] {
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(new Dog()),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Dog(),
                new Butterfly(),
                new Cat()
        });

    }
}
