package ClassWork;

import java.util.Scanner;

public class student {
    String name;
    int id;
    int age;

    void display_details() {
        String status = "Active";
        System.out.println("Your name is " + name);
        System.out.println("Your id is " + id);
        System.out.println("Your age is " + age);
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {
        student s1 = new student();

        s1.name = "Shiva";
        s1.id = 101;
        s1.age = 20;

        s1.display_details();
    }
}
