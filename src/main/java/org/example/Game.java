package org.example;

import org.example.zoo.Animal;
import org.example.zoo.Wolf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    List<Animal> animals = new ArrayList<>();
    static List<Animal> typeAnimals = new ArrayList<>();




    public void nextDay() {
    }

    void printAllAnimals(){

        for (int i = 0; i < Parameters.START_WOLF_AMT; i++) {
            animals.add(new Wolf());
        }
        for (Animal a:animals) {
            System.out.println(a);
        }
    }
}
