package day1.src.level2_28;
import java.util.Scanner;
public class Factor {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("Ente the number you want to find the factorial :");
        int num = sa.nextInt();

        for (int i = 1 ; i <=num ; i++ ){
            if(num%i==0){
                System.out.println(i);
            }
            else{}
        }
    }
}
