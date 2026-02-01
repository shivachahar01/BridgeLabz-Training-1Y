package day1.src.level2_28;
import java.util.Scanner;
public class FizzBussFormWhileLoop {
    public static void main(String[] args){
    Scanner sa= new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sa.nextInt();
        String a = "Enter the positive number";
        if(num>0){
            int i = 1 ;
            while(i<=num){
                if(i%3==0 && i%5==0){
                    System.out.println("FizzBuzz");
                }
                else if(i%3==0){
                    System.out.println("Fizz");
                }
                else if(i%5==0){
                    System.out.println("Buzz");
                }
                else{
                    System.out.println(i);
                }

                i++;
            }
        }
        else{
            System.out.println("Enter the positive number !!");
        }
    }
}
