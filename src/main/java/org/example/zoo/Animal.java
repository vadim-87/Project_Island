package org.example.zoo;

public abstract class Animal implements Move{
   private String name;

//    public Animal(String name) {
//        this.name = name;
//    }

    public abstract void moving ();

    public abstract void eat(Animal animal, boolean b);
}
