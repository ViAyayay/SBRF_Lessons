package ru.sbrf.java.lesson6;

public abstract class Overland extends Animals {
    @Override
    public void movement() {
        baseLandMove();
    }

    public abstract void baseLandMove();

    public abstract void climbUpTree();

    public abstract void swimming();
}
