package org.example.zoo;

public class Wolf extends Predator {
//    public Wolf(String name) {
//        super(name);
//    }

    @Override
    public void moving() {
        System.out.println("wolf move");
    }

    @Override
    public void eat(Animal animal, boolean b) {

    }
}
