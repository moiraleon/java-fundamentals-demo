package com.pluralsight.javaoopfundamentals;

import java.util.UUID;

public class Demo {
    public static void main(String[] args) {
        PaymentMethod eftAccount = new EftAccount("jane@janedoe.com");

        // create a new payment using that EFT account 
        PaymentIntf payment = new Payment(eftAccount, 100, UUID.randomUUID());

        // create a payment with the same characteristics but with added verification
        PaymentIntf highValuePayment = new HighValuePayment(payment);

        // make a reversible payment from either one 
        ReversiblePayment reversiblePayment = new ReversiblePayment(payment);
        System.out.println(reversiblePayment);
        ReversiblePayment reversibleHighValuePayment = new ReversiblePayment(highValuePayment);
        System.out.println(reversibleHighValuePayment);
    }
}
