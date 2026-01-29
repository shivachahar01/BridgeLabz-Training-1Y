package day1.src.level1_28;
import java.util.Scanner;
public class FactorialForLoop {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("enter the number for factorial :");
        int num = sa.nextInt();
        int fac = 1;
        for(int i = 1 ; i <= num ; i++){
            fac = fac*i;
        }
        System.out.printf("the factorial of %d is %d", num , fac );
    }
}
