package day1.src.Level3_28;
import java.util.Scanner;
public class PercentageToGrade {
    public static void main(String[] args){
        Scanner sa= new Scanner(System.in);
        System.out.println("ENter physics marks :");
        int phy = sa.nextInt();
        System.out.println("Enter chemistry marks :");
        int chem = sa.nextInt();
        System.out.println("ENter the maths marks :");
        int maths = sa.nextInt();

        int percent = (phy+chem+maths)/3;
        System.out.println(percent);
        if(percent>80){
            System.out.println("A");
        }
        else if(percent>=70 && percent <80){
            System.out.println("B");
        }
        else if(percent >=60  && percent <70  ){
            System.out.println("C");
        }
        else if(percent >= 50 && percent < 60 ){
            System.out.println("D");
        }
        else if(percent >=40 && percent < 50 ){
            System.out.println("E");
        }
        else{
            System.out.println("R");
        }
    }
}
