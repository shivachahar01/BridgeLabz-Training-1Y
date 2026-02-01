package day1.src.level2_28;
import java.util.Scanner;
public class FriendsAgeAndHeightComparison {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("enter the age of 1st friend :");
        int age1 = sa.nextInt();
        System.out.println("enter the height of 1st friend :");
        int hei1 = sa.nextInt();
        System.out.println("enter the age of 2nd friend :");
        int age2 = sa.nextInt();
        System.out.println("enter the height of 2nd friend :");
        int hei2 = sa.nextInt();
        System.out.println("enter the age of 3rd friend :");
        int age3 = sa.nextInt();
        System.out.println("enter the height of 3rd friend :");
        int hei3 = sa.nextInt();

        if(age1<age2 && age1<age3){
            System.out.println("the youngest one is 1st friend !!");
        }
        else if(age2<age1 && age2<age3){
            System.out.println("the youngest one is 2nd friend !!");
        }
        else if(age3<age2 && age3<age1){
            System.out.println("the youngest one is 3rd friend !!");
        }
        else {
            System.out.println("All are equal !!");
        }
        if(hei1>hei2 &&hei1>hei3){
            System.out.println("the 1st friend is tallest !!");
        }
        else if(hei2>hei3 &&hei2>hei1){
            System.out.println("the 2nd friend is tallest !!");
        }
        else if(hei3>hei2 &&hei3>hei1){
            System.out.println("the 1st friend is tallest !!");
        }
        else {
            System.out.println("all are equal in height!!");
        }

    }
}
