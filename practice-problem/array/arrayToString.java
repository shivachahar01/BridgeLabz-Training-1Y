package day1.src.ClassWork;
import java.util.Scanner;
import java.util.Arrays;
public class arrayToString {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sa.nextInt();
int[] arr= new int[n];
for(int i = 0 ; i<n ; i++){
    arr[i] = sa.nextInt();
}
        System.out.println(Arrays.toString(arr));
    }
}
