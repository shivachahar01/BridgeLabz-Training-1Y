package array;
import java.util.*;
public class reverseArray {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("enter the number of element :");
        int n = sa.nextInt();
       //input of array
        int[] arr = new int[n];
        for (int i = 0 ; i< n ; i++){
            arr[i] = sa.nextInt();
        }
        //reversing of array
        for(int i =0 ; i< n/2; i++){
          int temp = arr[n-i-1];
          arr[n-i-1] = arr[i];
          arr[i] = temp;
        }

        //print arry

        for(int i= 0 ; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
