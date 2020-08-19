package ru.sbrf.java.lesson6;

public abstract class Claws {
    public abstract void climbUpTree();
}

class GoodClaws extends Claws {
    public void climbUpTree() {
        System.out.println(" climbing on tree");
    }
}

class BadClaws extends Claws {
    public void climbUpTree() {
        System.out.println(" bad climbing on tree");
    }

}
