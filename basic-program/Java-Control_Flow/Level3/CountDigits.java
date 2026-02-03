package day1.src.Level3_28;
import java.util.Scanner;
public class CountDigits {
    static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sa.nextInt();
        int count = 0 ;
        int rem ;
        while(num>0){
            count++;
            num = num/10;


        }
        System.out.println(count);
    }
}
