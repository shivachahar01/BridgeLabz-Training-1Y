package com.gla.stream_api;

import java.util.*;

public class EmailNotificationService {

    public static void sendNotificationEmail(String userEmail) {
        System.out.println("Notification sent to: " + userEmail);
    }

    public static void main(String[] args) {

        List<String> emailList = Arrays.asList("user1@gmail.com", "user2@gmail.com");

        emailList.forEach(email -> sendNotificationEmail(email));
    }
}
