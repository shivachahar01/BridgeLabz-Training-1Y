import java.util.*;
public class CleciousFarhConverter {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("enter temp. in celcious :");
        int celcious = sa.nextInt();
        float feh= (celcious*9.0f/5.0f) + 32;

        System.out.println("temp in fehrenite :"+ feh +"F");
    }
}
