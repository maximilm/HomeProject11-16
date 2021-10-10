package ru.mirea.java.practice16;

public class Dish implements Item{
    private final int price;
    private final String name;
    private final String description;
    private final int priceZero = 0;
    public Dish(int price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }
    public Dish(String name, String description) {
        this.price = priceZero;
        this.name = name;
        this.description = description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }
}