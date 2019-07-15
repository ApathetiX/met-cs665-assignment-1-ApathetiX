package edu.bu.met.cs665.beverage;

public class Beverage {
    private String name;
    private int size;

    public Beverage(String n, int s) {
        this.name = n;
        this.size = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
