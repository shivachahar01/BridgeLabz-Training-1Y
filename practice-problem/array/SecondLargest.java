package array;
import java.util.*;
public class SecondLargest {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        int n = sa.nextInt();
        // array input
        int[] arr = new int[n];
        for(int i = 0 ; i<n ;i++){
             arr[i] = sa.nextInt();
        }
        // initilising max and second max
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        // loop for assign the value
        for(int i =0 ; i<n ; i++){
            if(arr[i]>max){
                second = max;
                max = arr[i];
            }
        }
            // print the value
            System.out.println("the max is "+ max);
            System.out.println("the second max is "+ second);
    }
}
