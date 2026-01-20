import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("enter number a :");
        int a = sa.nextInt();
        System.out.println("enter number b :");
        int b = sa.nextInt();

        System.out.println("the sum of a and b is "+ (a+b));
    }
}
