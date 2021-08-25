package com.pluralsight.javaoopfundamentals;

public class Demo {
    public static void main(String[] args) {

        Product toothbrush = Catalogue.getProduct("Electric Toothbrush");
        Product babyAlarm = Catalogue.getProduct("Baby Alarm");
        Product warAndPeace = Catalogue.getProduct("War and Peace (e-book)");

        ShoppingCart cart = new ShoppingCart();
        cart.addLineItem(new LineItem(babyAlarm, 1));
        cart.addLineItem(new LineItem(warAndPeace, 1));
        LineItem toothbrushes = new LineItem(toothbrush, 2);
        cart.addLineItem(toothbrushes);

        // calculate the total shipping cost for the cart
        int totalShippingCost = cart.getLineItems().stream()
              .mapToInt(LineItem::calculateShippingCost)
              .sum();

        System.out.println(totalShippingCost);
    }
}
