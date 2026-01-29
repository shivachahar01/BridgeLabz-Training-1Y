package day1.src.level1_28;
import java.util.Scanner;
public class FactorialWhileLoop {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.print("enter the number number to find factorial :");
        int num = sa.nextInt();
        int fac = 1 ;
        int i = 1 ;
        while(i<=num){
            fac= fac*i;
            i++;
        }
        System.out.printf("the factorial of %d is %d" , num , fac);
    }
}
