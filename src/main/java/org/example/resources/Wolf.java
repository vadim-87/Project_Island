package org.example.resources;

public class Wolf extends Predator {
    public Wolf(String name) {
        super(name);
    }

    @Override
    public void moving() {
        System.out.println("wolf move");
    }
}
