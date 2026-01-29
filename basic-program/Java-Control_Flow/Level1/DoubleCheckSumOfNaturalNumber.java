package day1.src.level1_28;
import java.util.Scanner;
public class DoubleCheckSumOfNaturalNumber {
    public static void main(String[] args){
        Scanner sa= new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sa.nextInt();
        int sum = 0;
        int i = 1 ;
        while(i<=n){
            sum += i;
            i++;
        }
       int Formula = n*(n+1)/2;

        if(Formula == sum) {
            System.out.println("the sum of n nature number by double checking is " + sum);
        }
    }
}
