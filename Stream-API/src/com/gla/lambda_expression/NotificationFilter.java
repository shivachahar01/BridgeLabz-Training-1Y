package com.gla.lambda_expression;

import java.util.*;
import java.util.function.Predicate;

class Alert {
    String msg, type;

    Alert(String m, String t) {
        msg = m; type = t;
    }

    public String toString() {
        return type + " " + msg;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> list = Arrays.asList(
                new Alert("High BP","CRITICAL"),
                new Alert("Reminder","NORMAL"),
                new Alert("Low oxygen","CRITICAL")
        );

        Predicate<Alert> f = a -> a.type.equals("CRITICAL");
        list.stream().filter(f).forEach(System.out::println);
    }
}
