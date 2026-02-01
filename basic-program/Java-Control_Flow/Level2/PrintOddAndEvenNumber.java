package day1.src.level2_28;
import java.util.Scanner;
public class PrintOddAndEvenNumber {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sa.nextInt();

        for(int i = 1 ; i<=num ; i++){
            if(i%2 == 0){
                System.out.println(i +" is Even" );

            }
            else{
                System.out.println(i+"is odd");
            }
        }
    }
}
