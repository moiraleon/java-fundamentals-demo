package com.pluralsight.javaoopfundamentals;

import java.util.Optional;

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

        Customer janeDoe = new Customer("Jane Doe");
        janeDoe.addPaymentMethod("Jane's Credit Card", new CreditCard(5420793615183044L));
        janeDoe.addPaymentMethod("Jane's Bank Account", new BankAccount(80_80_80, 00646160));

        Optional<Order> order = janeDoe.checkout(cart, "Jane's Bank Account");
        System.out.println(order);
    }
}
