package day1.src.array;

public class sumArray {
    public static void main(String[] args){
        int[] arr ={12,43,64,11};
        int sum=0;
        for(int i = 0; i< arr.length; i++){
            sum= sum+arr[i];
        }
        System.out.println(sum);
    }
}
