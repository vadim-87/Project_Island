package org.example;

import org.example.zoo.Animal;
import org.example.zoo.Bear;
import org.example.zoo.Horse;
import org.example.zoo.Wolf;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static final int PERCENT = 100;
    static int chance = 60;
    public static void main(String[] args) {
        Animal bear = new Bear();
        Animal horse = new Horse();
        int ran = ThreadLocalRandom.current().nextInt(0, PERCENT);
        boolean i = (PERCENT - chance) < ran;
        System.out.println("chance = " +ran + "%");
        bear.eat(horse, i);

    }
}