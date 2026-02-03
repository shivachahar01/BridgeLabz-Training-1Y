package day1.src.Level3_28;
import java.util.Scanner;
public class LeapYearUsingIfElse {
    public static void main(String[] args){
        Scanner sa= new Scanner(System.in);
        System.out.println("Enter the year :");
        int year = sa.nextInt();

        if(year>=1582){
            if(year%400==0){
                System.out.println("Leap Yaer!!");
            }
            else if(year%100==0){
                System.out.println("not a leap yaer!!");
            }
            else if(year%4==0){
                System.out.println("leap year");
            }
            else{
                System.out.println("not a leap yaer");
            }
        }
        else{
            System.out.println("enter the number over 1582");
        }
    }
}
