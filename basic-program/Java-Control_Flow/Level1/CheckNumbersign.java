package day1.src.level1_28;
import java.util.*;
public class CheckNumbersign {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sa.nextInt();
        if (num>0){
            System.out.println("the number is positive !!");
        }
        else if(num<0){
            System.out.println("the number is negative !!");
        }
        else {
            System.out.println("the number is zero !!");
        }
    }
}
