package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static final int PERCENT = 100;
    static int chance = 60;
    public static void main(String[] args) {
        int ran = ThreadLocalRandom.current().nextInt(0, PERCENT);
        boolean i = (PERCENT - chance) < ran;


    }
}