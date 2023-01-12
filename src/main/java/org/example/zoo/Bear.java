package org.example.zoo;

public class Bear extends Predator{
    private int appetit = 5;

    @Override
    public void moving() {

    }


    public void eat (Animal animal, boolean b){
        if(b){
            System.out.println(this.toString() +" eat " + animal.toString());
            this.appetit += 1;
        }
        else {
            System.out.println(animal.toString() + " ran away from " + this.toString());
        }
    }

    @Override
    public String toString() {
        return "bear";
    }
}
