package com.gla.stream_api;

import java.util.*;

public class EventWelcomeSystem {
    public static void main(String[] args) {

        List<String> attendeeNames = Arrays.asList("Aman", "Rahul", "Tanishq");

        attendeeNames.forEach(name ->
                System.out.println("Welcome to the event, " + name + "!")
        );
    }
}
