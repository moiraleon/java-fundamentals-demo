package com.pluralsight.javaoopfundamentals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class Demo {
    public static void main(String[] args) {
        Customer janeDoe = new Customer("Jane Doe", 5420793615183044L);
        Customer acme = new BusinessCustomer("Acme Products", 4556642663443553L, BusinessCustomer.BusinessSize.LARGE);
        Customer globex = new BusinessCustomer("Globex Corp", 5463503666563574L, BusinessCustomer.BusinessSize.LARGE);
        Customer saveTheWorld = new NonprofitCustomer("Save The World", 5381428244287646L);

        // Java 8
        List<Customer> customers = Arrays.asList(janeDoe, acme, globex, saveTheWorld);

        // Java 9+ idiom
        // List<Customer> customers = List.of(janeDoe, acme, globex, saveTheWorld);

        // count how many customers are on each discount rate
        Map<Integer, Long> discountMap = customers.stream()
                .collect(Collectors.groupingBy(Customer::calculateDiscount, counting()));

        System.out.println(discountMap);

        // alternative way to count, using iteration instead of streams
        discountMap = new HashMap<>();
        for (Customer c : customers) {
            discountMap.merge(c.calculateDiscount(), 1L, Long::sum);
        }

        System.out.println(discountMap);
    }
}