package org.example.resources;

public abstract class Animal {
   private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void moving ();
}
