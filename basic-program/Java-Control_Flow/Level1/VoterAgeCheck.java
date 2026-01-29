package day1.src.level1_28;
import java.util.*;
public class VoterAgeCheck {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.println("enter your age :");
        int age = sa.nextInt();
        if (age > 0) {
            if (age > 120) {
                System.out.println("you can not live longer then 120 years !!");
            } else if (age >= 18) {
                System.out.println("you can vote!! ");
            } else {
                System.out.println("you can not vote!! ");
            }
        }
        else{
            System.out.println("Enter valid age !!");
        }
    }
}
