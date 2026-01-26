package array;
import java.util.*;
public class input_array {
    public static void main(String[] args){

                Scanner sa = new Scanner(System.in);
                System.out.println("enter the number of element :");
                int n = sa.nextInt();
                int[] arr = new int[n];
                for(int i=0 ; i<n ; i++){
                    arr[i] = sa.nextInt();
                }

        for(int i = 0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
    }
}
