package edu.bu.met.cs665.beverage.coffee_subclasses;

import edu.bu.met.cs665.beverage.Coffee;

public class Latte extends Coffee {
    private final int brewTime = 30;

    public Latte(String n, int s) {
        super(n, s);
    }

    public int getBrewTime() {
        return this.brewTime;
    }
}
