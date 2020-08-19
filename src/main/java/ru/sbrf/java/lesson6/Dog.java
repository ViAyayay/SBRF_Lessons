package ru.sbrf.java.lesson6;

public class Dog extends Overland {
    private final Paws PAWS;
    private final Jaw JAW;

    public Dog() {
        PAWS = new Paws(new BadClaws());
        JAW = new Jaw();
    }

    public void baseLandMove() {
        printClassName();
        PAWS.runOnGround();
    }

    public void climbUpTree() {
        printClassName();
        PAWS.claws.climbUpTree();
    }

    public void swimming() {
        printClassName();
        System.out.println(" swimming");
    }

    public void eat() {
        printClassName();
        JAW.eat();
    }
}
