import java.util.*;
public class AverageOfNumbers {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);

        System.out.println("enter number a :");
        int a = sa.nextInt();
        System.out.println("enter number b :");
        int b = sa.nextInt();
        System.out.println("enter number b :");
        int c = sa.nextInt();
        float avg = (a+b+c)/3;
        System.out.printf("the avg is : %.2f" , avg);
    }
}
