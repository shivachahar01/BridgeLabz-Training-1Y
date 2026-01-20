import java.util.*;
public class max_element{
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        int n = sa.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i<n ; i++){
            arr[i] = sa.nextInt();
        }
        int max = arr[0];
        for(int i = 0 ; i<n ; i++){
            if(arr[i]>max){
                max = arr[i];

            }

        }
        System.out.println(max);
    }
}