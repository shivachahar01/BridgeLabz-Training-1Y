package com.gla.lambda_expression;

import java.util.*;

class Product {
    String name;
    double price, rating, discount;

    Product(String n, double p, double r, double d) {
        name = n; price = p; rating = r; discount = d;
    }

    public String toString() {
        return name + " " + price + " " + rating + " " + discount;
    }
}

public class EcommerceSorting {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Laptop",70000,4.5,10));
        list.add(new Product("Phone",30000,4.8,15));
        list.add(new Product("Headphones",2000,4.2,20));

        list.sort((a,b)->Double.compare(a.price,b.price));
        list.forEach(System.out::println);

        list.sort((a,b)->Double.compare(b.rating,a.rating));
        list.forEach(System.out::println);

        list.sort((a,b)->Double.compare(b.discount,a.discount));
        list.forEach(System.out::println);
    }
}
