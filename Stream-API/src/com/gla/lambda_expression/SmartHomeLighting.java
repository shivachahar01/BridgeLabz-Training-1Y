package com.gla.lambda_expression;

import java.util.function.Consumer;

public class SmartHomeLighting {
    public static void main(String[] args) {
        Consumer<String> motion = r -> System.out.println("Motion in " + r + " -> Lights ON");
        Consumer<String> night = r -> System.out.println("Night mode in " + r + " -> Dim lights");
        Consumer<String> voice = c -> System.out.println("Command: " + c + " -> Adjust");

        motion.accept("Living Room");
        night.accept("Bedroom");
        voice.accept("Turn off lights");
    }
}
