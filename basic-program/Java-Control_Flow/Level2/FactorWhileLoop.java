package day1.src.level2_28;
import java.sql.SQLOutput;
import java.util.Scanner;
public class FactorWhileLoop {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sa.nextInt();
        int i=1;
        while(i<=num){
            if(num%i==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
