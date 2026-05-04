package com.gla.lambda_expression;

import java.util.*;

public class PatientIDPrinter {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(101,102,103,104);
        ids.forEach(System.out::println);
    }
}
