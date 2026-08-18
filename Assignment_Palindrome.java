package basics;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = sc.nextLine();

        String reverse = "";

     
        for (int i = word.length() - 1; i >= 0; i--) {

            reverse = reverse + word.charAt(i);

        }

        System.out.println("Reversed String: " + reverse);

        if (word.equalsIgnoreCase(reverse)) {

            System.out.println("Palindrome");

        } else {

            System.out.println("Not Palindrome");

        }

        sc.close();
    }
}
