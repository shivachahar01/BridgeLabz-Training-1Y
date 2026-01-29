package day1.src.level1_28;
import java.util.*;
public class SmallestOfThree {
    public static void main(String[] args){
        Scanner sa= new Scanner(System.in);
        System.out.println("enter the first number :");
        int a = sa.nextInt();
        System.out.println("enter the second number :");
        int b = sa.nextInt();
        System.out.println("enter the third number :");
        int c = sa.nextInt();

        if(a<b && a<c){
            System.out.println("first number Smaller then others");
        }
        else {
            System.out.println("other number is small");
        }
    }
}
