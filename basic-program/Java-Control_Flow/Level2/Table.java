package day1.src.level2_28;
import java.util.Scanner;
public class Table {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a =  sa.nextInt();
        if(a>5 && a<10) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(a + "x" + i + "=" + a * i);
            }
        }
        else {
            System.out.println("enter number between 6 and 9");
        }
    }
}
