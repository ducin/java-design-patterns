package com.blogspot.sysexit.patterns.decorator;

public class Espresso extends Beverage {
    String description = "Espresso";

    @Override
    public double cost() {
        return 1.99;
    }
}
