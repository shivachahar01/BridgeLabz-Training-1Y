package day1.src.level1_28;
import java.util.*;
public class DivisibleRule {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sa.nextInt();
        if(num%5 ==0){
            System.out.println(num+"the number is divisible by 5");
        }
        else {
            System.out.println(num+"the number is not divisible by 5");
        }
    }
}
