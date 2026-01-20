import java.util.*;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("enter the princiapl amount: ");
        int prin = sa.nextInt();

        System.out.println("enter the rate :");
        int rate = sa.nextInt();

        System.out.println("enter time :");
        int time = sa.nextInt();

        double simple_intrest = (prin * rate *time)/100;

        System.out.println("simple intrest is : " +simple_intrest);
    }
}
//Simple Interest = (Principal * Rate * Time) / 100.