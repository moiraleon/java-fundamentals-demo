package com.pluralsight.javaoopfundamentals;

public abstract class Product {

    private String name;
    private int price;
    private int productDiscount;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        int shippingCost = calculateShippingCost();
        return Math.round((1 - productDiscount) * price) + shippingCost;
    }

    public void setProductDiscount(int productDiscount) {
        this.productDiscount = productDiscount;
    }

    @Override
    public String toString() {
        return "Product{" +
              "name='" + name + '\'' +
              ", price=" + price +
              ", discount=" + productDiscount +
              '}';
    }

    public abstract int calculateShippingCost();
}
