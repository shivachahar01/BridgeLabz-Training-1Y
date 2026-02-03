package day1.src.Level3_28;
import java.util.Scanner;
public class HarshadNumber {
   public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("Ente the number :");
        int num = sa.nextInt();
        int sum = 0 ;
        int temp = num;
        int rem;
        while(num>0){
            rem = num%10;
            sum += rem ;
            num /= 10;
        }
        if(temp%sum==0){
            System.out.println("this is harshad number !!");
        }
        else {
            System.out.println("this is not a harshad number !!");
        }
    }
}
