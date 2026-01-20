import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("enter the radius :");
        int radius = sa.nextInt();

        double area =Math.PI *radius*radius;
        System.out.printf("Area of circle is : %.2f", area);
    }
}
