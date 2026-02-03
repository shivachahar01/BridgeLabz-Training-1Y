package day1.src.Level3_28;
import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args){
        Scanner sa= new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sa.nextInt();
        int sum = 0 ;
        for(int i = 1 ; i<num ; i++){
            if(num%i==0){
                sum += i;
            }
        }
        System.out.println("sum"+sum);
        System.out.println("number"+num);
        if(sum>num){
            System.out.println("Abundant number !!");
        }
        else {
            System.out.println("not an abundant number !!");
        }
    }
}
