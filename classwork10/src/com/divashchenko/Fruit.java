package com.divashchenko;

public class Fruit {
    // type
    private FruitType type;

    // color
    private Color color;

    // weight (kg)
    private double weight;

    // price (kg)
    private double priceKg;

    public Fruit() {
    }

    public Fruit(FruitType type) {
        this.type = type;
    }

    public Fruit(FruitType type, Color color, double weight, double priceKg) {
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.priceKg = priceKg;
    }

    //========================================================

    public double price() {
        return weight * priceKg;
    }

    //========================================================

    public FruitType getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public double getPriceKg() {
        return priceKg;
    }

    //========================================================

    public void setType(FruitType type) {
        this.type = type;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPriceKg(double priceKg) {
        this.priceKg = priceKg;
    }

    //========================================================

    @Override
    public String toString() {
        return "Fruit{" +
                "type=" + type +
                ", color=" + color +
                ", weight=" + weight +
                ", priceKg=" + priceKg +
                '}';
    }
}