import java.util.Scanner;
public class input{
    public static void main(String[] args){
        Scanner ms = new Scanner(System.in);

        System.out.println("enter a :");
        int a = ms.nextInt();
        System.out.println("enter b :");
        int b = ms.nextInt();

        if(a>b){
            System.out.printf( "a is greater value %d" , a );

        }

        else if(a<b){
            System.out.printf("b is greater value %d" , b);
        }
        else {
            System.out.println("both are eqaul");
        }

    }

}