package day1.src.level1_28;
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("enter the number :");
        int a = sa.nextInt();
        int sum = 0 ;
        if(a>=0){
            for(int i =0 ; i<=a ; i++){
                sum = sum +i;
            }
        }
        else {
            System.out.println("not a natural number ");
        }
        System.out.println("the sum of n natural numbers is :"+sum);
    }
}
