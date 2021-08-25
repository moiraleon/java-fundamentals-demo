package com.pluralsight.javaoopfundamentals;

public class Order {
    private final Customer customer;
    private final ShoppingCart cart;
    private final PaymentIntf payment;

    public Order(Customer customer, ShoppingCart cart, PaymentIntf payment) {
        this.customer = customer;
        this.cart = cart;
        this.payment = payment;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    @Override
    public String toString() {
        return "Order{" +
                "\n customer=" + customer +
                ",\n cart=" + cart +
                ",\n payment=" + payment +
                "\n}";
    }
}
