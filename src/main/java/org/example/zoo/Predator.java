package org.example.zoo;

import org.example.island.Cell;

public abstract class Predator implements Animal {
    Cell position;
    int coordinatesX;
    abstract void eat();



}
