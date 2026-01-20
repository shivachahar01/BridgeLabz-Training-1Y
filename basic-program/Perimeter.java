import java.util.*;
public class Perimeter {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("enter length :");
        int len = sa.nextInt();
        System.out.println("enter the bredth :");
        int bre = sa.nextInt();

        double perimeter = 2*(len*bre);
        System.out.println("peremeter : "+ perimeter);
    }
}
