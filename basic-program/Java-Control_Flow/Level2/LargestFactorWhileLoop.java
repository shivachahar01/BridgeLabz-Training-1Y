package day1.src.level2_28;
import java.util.Scanner;
public class LargestFactorWhileLoop {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("ENter the number :");
        int num = sa.nextInt();
        int GreatestFactor = 0 ;
        int i = 1 ;
        while(i<num ){
            if(num%i==0){
                GreatestFactor = i ;
            }
                i++;
        }
        System.out.println(GreatestFactor);
    }
}
