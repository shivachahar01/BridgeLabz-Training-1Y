package com.gla.stream_api;

import java.util.*;

public class StockPriceTracker {
    public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(101.5, 102.3, 99.8);

        stockPrices.forEach(price ->
                System.out.println("Live Stock Price: " + price)
        );
    }
}
