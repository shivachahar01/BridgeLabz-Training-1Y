package day1.src.level1_28;
import java.util.Scanner;

public class FindSumUntilZero {
    public static void main(String[] args) {

        Scanner sa = new Scanner(System.in);

        double total = 0.0;
        double num;

        System.out.print("Enter a number (0 to stop): ");
        num = sa.nextDouble();

        while (num != 0) {
            total = total + num;

            System.out.print("Enter a number (0 to stop): ");
            num = sa.nextDouble();
        }

        System.out.println("The sum is " + total);
    }
}
