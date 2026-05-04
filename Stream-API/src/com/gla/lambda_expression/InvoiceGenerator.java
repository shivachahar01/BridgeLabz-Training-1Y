package com.gla.lambda_expression;

import java.util.*;
import java.util.stream.*;

class Invoice {
    int id;

    Invoice(int i) {
        id = i;
    }

    public String toString() {
        return "Invoice " + id;
    }
}

public class InvoiceGenerator {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(1001,1002,1003);
        ids.stream().map(Invoice::new).forEach(System.out::println);
    }
}
