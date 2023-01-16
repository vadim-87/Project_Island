package org.example.zoo;

import org.example.Cell;

public abstract class Predator implements Animal {
    Cell position;

//    public Predator(Cell position, int coordinatesX) {
//        this.position = position;
//        this.coordinatesX = coordinatesX;
//    }

    int coordinatesX;
    abstract void eat();



}
