package ru.sbrf.java.lesson6;

public class Paws {
    public Claws claws;

    public Paws(Claws claws) {
        this.claws = claws;
    }

    public void swim() {
        System.out.println(" swim");
    }

    public void runOnGround() {
        System.out.println(" run on the ground");
    }
}

