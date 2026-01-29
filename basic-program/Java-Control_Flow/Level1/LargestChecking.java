package day1.src.level1_28;
import java.util.Scanner;
public class LargestChecking {
    public static void main(String[] args){
    Scanner sa= new Scanner(System.in);
        System.out.println("enter the first number :");
        int a = sa.nextInt();
        System.out.println("enter the second number :");
        int b = sa.nextInt();
        System.out.println("enter the third number :");
        int c = sa.nextInt();

        if(a>=b && a>=c){
            System.out.println("first is largest then second and third");
        }
        else if(b>=a && b>=c){
            System.out.println("second is largest then first and third");
        }
        if(c>=a && c>=b){
            System.out.println("third is largest then second and first");
        }
        else {
            System.out.println("all are eqaul ");
        }
    }
}
