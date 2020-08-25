package ru.sbrf.java.lesson6;

public class Dog extends Animals implements SwimAble {
    private final Paws PAWS;
    private final Jaw JAW;

    public Dog() {
        PAWS = new Paws();
        JAW = new Jaw();
    }

    public void movement() {
        printClassName();
        PAWS.runOnGround();
    }

    public void swimming() {
        printClassName();
        PAWS.swimming();
    }

    public void eat() {
        printClassName();
        JAW.eat();
    }

}
