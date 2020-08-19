package ru.sbrf.java.lesson6;

public class Main {
    public static void main(String[] args) {
        doTestTask();
    }

    private static void doTestTask() {
        Animals cat = new Cat();
        cat.movement();
        cat.eat();

        Overland dog = new Dog();
        dog.swimming();
        dog.climbUpTree();
        dog.baseLandMove();
    }
}

