package com.pluralsight.javaoopfundamentals;

public class Demo {
    public static void main(String[] args) {
/*
        // creating new Product objects for every program execution
        Product toothbrush = new Product("Electric Toothbrush", 3550);
        Product babyAlarm = new Product("Baby Alarm", 4999);
*/
        // simulating retrieval of Product objects from a database
        Product toothbrush = Catalogue.getProduct("Electric Toothbrush");
        Product babyAlarm = Catalogue.getProduct("Baby Alarm");

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(toothbrush);
        cart.addProduct(babyAlarm);
        System.out.println(cart);
        System.out.println(cart.getTotalCost());
    }
}
