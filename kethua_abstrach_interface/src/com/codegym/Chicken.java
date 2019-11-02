package com.codegym;

public class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Thit ga an kha ngon";
    }

    @Override
    String makeSound() {
        return "Ga con keo chip chip";
    }
}
