package com.pluralsight.javaoopfundamentals;

public class PhysicalProduct extends Product {

   private int weight;

   public PhysicalProduct(String name, int price, int weight) {
      super(name, price);
      this.weight = weight;
   }

   @Override
   public int calculateShippingCost() {
      return Catalogue.SHIPPING_RATE * weight;
   }
}
