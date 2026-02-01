package day1.src.level2_28;
import java.util.Scanner;
public class MultiplesUnderHundreds {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter th number :");
        int num = sa.nextInt();

        if(num>0 && num<=100){
            for(int i=100 ; i>0 ;i--){
                if(i%num==0){
                    System.out.println(i);
                }
            }
        }
        else {
            System.out.println("ENter the number between 0 to 100");
        }
    }
}
