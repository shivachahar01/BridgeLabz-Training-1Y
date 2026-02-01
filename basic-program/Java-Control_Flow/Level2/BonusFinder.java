package day1.src.level2_28;
import java.util.Scanner;
public class BonusFinder {
    public static void main (String[] args){
Scanner sa = new Scanner(System.in);
        System.out.println("Enter the salary : ");
        int salary = sa.nextInt();
        System.out.println("enter the year of Experience :");
        int years = sa.nextInt();

        if(years >= 5){
            int a = (salary*5)/100;
            System.out.println("the bonus is :" +a);
        }
        else {
            System.out.println("you are under 5 years of experience !! bonus Zero");
        }


    }
}
