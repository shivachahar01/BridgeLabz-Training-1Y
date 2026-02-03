package day1.src.array;
import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {

        Scanner sa = new Scanner(System.in);

        System.out.println("Enter no. of row elements:");
        int row = sa.nextInt();

        System.out.println("Enter no. of column elements:");
        int col = sa.nextInt();

        int[][] arr = new int[row][col];


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sa.nextInt();
            }
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("row %d col %d value %d\n", i, j, arr[i][j]);
            }
        }
    }
}
