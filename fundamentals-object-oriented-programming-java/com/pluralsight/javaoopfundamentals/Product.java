package com.pluralsight.javaoopfundamentals;

public class Product {

    private final String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n" + "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
