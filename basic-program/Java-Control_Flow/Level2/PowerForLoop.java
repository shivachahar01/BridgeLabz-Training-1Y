package day1.src.level2_28;
import java.util.Scanner;
public class PowerForLoop {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sa.nextInt();
        System.out.println("Enter the power :");
        int pow = sa.nextInt();
        int result = 1 ;
        if(num>0 && pow>0){
            for(int i = 1; i<=pow ; i++){
                result = result*num;
            }
        }
        else{
            System.out.println("Enter positive number !!");
        }
        System.out.println("the result is :"+result);
    }
}
