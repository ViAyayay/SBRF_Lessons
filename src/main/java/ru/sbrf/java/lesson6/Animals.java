package ru.sbrf.java.lesson6;

public class Animals {
    public void printClassName() {
        System.out.print(this.getClass().getSimpleName());
    }

    public void movement() {
        printClassName();
        System.out.println(" move");
    }

    public void eat() {
        printClassName();
        System.out.println(" eat");
    }
}
