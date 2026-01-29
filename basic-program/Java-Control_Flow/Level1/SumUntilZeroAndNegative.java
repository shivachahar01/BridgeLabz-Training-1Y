package day1.src.level1_28;
import java.util.Scanner;
public class SumUntilZeroAndNegative {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("enter the number :");
        double num = sa.nextDouble();
        double total = 0.0;

        while(num>0){
            total += num;

            System.out.println("Enter the number 0 or negative number to exit from code ");
            num = sa.nextDouble();
        }
        System.out.println("the grand total is :"+total);
    }
}
