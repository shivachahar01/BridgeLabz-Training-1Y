package day1.src.level1_28;
import java.util.Scanner;
public class DoubleCheckSumOfNaturalNumberForLoop {
    public static void main(String[] args){
        Scanner sa= new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sa.nextInt();
        int sum = 0;
       for(int i = 0 ; i<=n ; i++){
           sum = sum+i;
       }
        int Formula = n*(n+1)/2;

        if(Formula == sum) {
            System.out.println("the sum of n nature number by double checking is " + sum);
        }
    }
}
