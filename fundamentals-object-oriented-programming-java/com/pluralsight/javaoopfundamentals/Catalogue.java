package com.pluralsight.javaoopfundamentals;

import java.util.HashMap;
import java.util.Map;

public class Catalogue {

/*
    // Java 9 and later
    private static Map<String, Product> productMap = Map.of(
            "Electric Toothbrush", new Product("Electric Toothbrush", 3550),
            "Baby Alarm", new Product("Baby Alarm", 4999)
    );
*/

    // Java 8 and earlier
    public static Map<String,Product> productMap = new HashMap<>();
    static {
        productMap.put("Electric Toothbrush", new Product("Electric Toothbrush", 3550));
        productMap.put("Baby Alarm", new Product("Baby Alarm", 4999));
    }

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
