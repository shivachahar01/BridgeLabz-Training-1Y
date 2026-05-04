package com.gla.stream_api;

import java.util.*;

public class CustomerNameFormatter {
    public static void main(String[] args) {

        List<String> customerNames = Arrays.asList("tanishq", "rahul", "aman");

        customerNames.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
