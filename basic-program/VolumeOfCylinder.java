import java.util.*;
public class VolumeOfCylinder {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("enter the radius :");
        int radius = sa.nextInt();
        System.out.println("enter the height: ");
        int height = sa.nextInt();

        double volume = Math.PI *radius*radius*height;

        System.out.println("volume is :" +volume);
    }
}
