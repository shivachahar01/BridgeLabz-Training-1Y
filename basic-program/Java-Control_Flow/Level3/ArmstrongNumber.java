package day1.src.Level3_28;
import java.util.Scanner;
public class ArmstrongNumber {
    static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sa.nextInt();
        int temp = num ;
        int sum = 0 ;
        int rem ;

        while (num>0){
            rem = num%10;
            sum += (rem*rem*rem);
            num = num/10;
        }
        if(temp==sum){
            System.out.println("armstring no.");
        }
        else{
            System.out.println("not a armstrong number !!");
        }
    }
}
