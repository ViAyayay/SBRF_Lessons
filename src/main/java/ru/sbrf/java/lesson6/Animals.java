package ru.sbrf.java.lesson6;

public abstract class Animals {
    public void printClassName() {
        System.out.print(this.getClass().getSimpleName());
    }

    public abstract void movement();

    public abstract void eat();
}
