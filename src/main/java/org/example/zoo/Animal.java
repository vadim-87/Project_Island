package org.example.zoo;

public abstract class Animal {
   private String name;

//    public Animal(String name) {
//        this.name = name;
//    }

    public abstract void moving ();

    public abstract void eat(Animal animal, boolean b);
}
