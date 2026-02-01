package day1.src.level2_28;
import java.util.Scanner;
public class LargestFactor {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sa.nextInt();
         int GreatestFactor = 0;
        for(int i=1; i<num ; i++){
            if(num%i==0){
                GreatestFactor = i;
            }
        }
        System.out.println(GreatestFactor);
    }
}
