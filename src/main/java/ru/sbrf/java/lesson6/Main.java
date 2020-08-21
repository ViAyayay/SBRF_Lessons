package ru.sbrf.java.lesson6;

public class Main {
    public static void main(String[] args) {
        doTestTask();
    }

    private static void doTestTask() {
        Animals cat = new Cat();
        cat.movement();
        cat.eat();

        Dog dog = new Dog();
        dog.swimming();

        Cat kitty = new Cat();
        kitty.climbUpTree();
    }

}

