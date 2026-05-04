package com.gla.lambda_expression;

import java.util.*;
import java.util.stream.*;

public class EmployeeUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rahul","aman","sneha");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
