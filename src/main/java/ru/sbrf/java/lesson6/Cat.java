package ru.sbrf.java.lesson6;

public class Cat extends Animals implements ClimbsAble {
    private final Paws PAWS;
    private final Claws CLAWS;
    private final Jaw JAW;

    public Cat() {
        PAWS = new Paws();
        CLAWS = new Claws();
        JAW = new Jaw();
    }

    public void movement() {
        printClassName();
        PAWS.runOnGround();
    }

    public void climbUpTree() {
        printClassName();
        CLAWS.climbUpTree();
    }

    public void eat() {
        printClassName();
        JAW.eat();
    }


}
