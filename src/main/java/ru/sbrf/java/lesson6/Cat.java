package ru.sbrf.java.lesson6;

public class Cat extends Overland {
    private final Paws PAWS;
    private final Jaw JAW;

    public Cat() {
        PAWS = new Paws(new GoodClaws());
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
        System.out.println(" bad swimming");
    }

    public void eat() {
        printClassName();
        JAW.eat();
    }


}
