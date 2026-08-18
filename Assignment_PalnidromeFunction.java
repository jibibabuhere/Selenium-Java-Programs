package basics;
import java.util.Scanner;

public class PalnidromeFunction {


    static void checkPalindrome(String text) {

        String reverse = "";


        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        if (text.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = sc.nextLine();

        checkPalindrome(word);

        sc.close();
    }
}
