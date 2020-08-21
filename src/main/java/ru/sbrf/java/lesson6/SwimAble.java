package ru.sbrf.java.lesson6;

public interface SwimAble {

    default void swimming() {
        System.out.println(" swimming");
    }
}
