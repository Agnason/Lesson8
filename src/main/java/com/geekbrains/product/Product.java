package com.geekbrains.product;

public class Product {
    private String name;
    private int price;
    private int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void info () {
        System.out.println(getName());
    }
}
