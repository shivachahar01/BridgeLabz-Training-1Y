package day1.src.Level3_28;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter the year :");
        int year = sa.nextInt();

        if(year%400==0 || (year%4==0 &&year%100!=0)){
            System.out.println("this is leap year !!");
        }
        else{
            System.out.println("not a leap year!!");
        }
    }
}
