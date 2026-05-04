import java.util.*;

public class PalindromeChecker {

    static String takeInput(Scanner sc) {
        return sc.nextLine();
    }

    static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    static void displayResult(boolean result) {
        if (result)
            System.out.println("It is a palindrome.");
        else
            System.out.println("Not a palindrome.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = takeInput(sc);

        displayResult(isPalindrome(input));
    }
}
