package com.gla.stream_api;

import java.util.*;

public class SensorMonitoringApp {
    public static void main(String[] args) {

        List<Double> sensorValues = Arrays.asList(25.5, 40.2, 18.0, 50.3);
        double alertThreshold = 30;

        sensorValues.stream()
                .filter(value -> value > alertThreshold)
                .forEach(value ->
                        System.out.println("Alert! High Sensor Reading: " + value)
                );
    }
}
