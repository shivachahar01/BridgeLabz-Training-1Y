import java.util.*;
public class PowerCalculation {
    public static void main(String[] args){
        Scanner sa= new Scanner(System.in);
        System.out.println("enter the number :");
        int a = sa.nextInt();
        System.out.println("enter the power :");
        int x= sa.nextInt();
        double result = Math.pow(a, x);
        System.out.printf("power of %d is %.2f" , a , result);
    }
}
