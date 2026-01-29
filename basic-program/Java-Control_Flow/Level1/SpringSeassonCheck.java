package day1.src.level1_28;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class SpringSeassonCheck {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.print("enter the month :");
        int month = sa.nextInt();
        System.out.println("enter the day :");
        int day = sa.nextInt();

        boolean isspring = false;
        if(month ==3 && day >=20 && day<=31){
            isspring = true;
        }
        else if(month ==4 && day>=1 &&day <=30){
            isspring = true;
        }
        else if(month ==5 && day>=1 && day<=31){
            isspring= true;
        }
        else if(month == 6 && day>=1 && day<=20){
            isspring= true;
        }
        else{
            System.out.println("invalid!!");
        }
        if(isspring){
            System.out.println("Spring season ");

        }
        else{
            System.out.println("not a spring season!!");
        }
    }

}