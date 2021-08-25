package com.pluralsight.javaoopfundamentals;

public class PhysicalProduct extends Product implements Replaceable {

   public enum ShippingCategory {
      BULKY, STANDARD, PREMIUM;
   }

   private int weight;
   private ShippingCategory shippingCategory;

   public PhysicalProduct(String name, int basePrice, int weight, ShippingCategory shippingCategory) {
      super(name, basePrice);
      this.weight = weight;
      this.shippingCategory = shippingCategory;
   }

   public int getWeight() {
      return weight;
   }

   public ShippingCategory getShippingCategory() {
      return shippingCategory;
   }

   @Override
   public PriceCalculator createPriceCalculator() {
      return new PhysicalProductPriceCalculator(this);
   }

   @Override
   public void ship() {
      switch (shippingCategory) {
         case STANDARD: // consign to standard courier
         case BULKY:    // book large-capacity vehicle and movers
         case PREMIUM:  // buy insurance and consign to secure courier
      }
   }

   @Override
   public void replace() {
      // buy special insurance
      ship();
   }
}
