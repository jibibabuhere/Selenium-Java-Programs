package basics;

import java.util.Scanner;
public class VowelsConsonantsCountFunction {


		// TODO Auto-generated method stub


	    static void countLetters(String text) {

	        int vowels = 0;
	        int consonants = 0;

	        for (int i = 0; i < text.length(); i++) {

	            char ch = text.charAt(i);

	            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {

	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

	                    vowels++;

	                } else {

	                    consonants++;
	                }
	            }
	        }

	        System.out.println("Number of vowels: " + vowels);
	        System.out.println("Number of consonants: " + consonants);
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String word = sc.nextLine();

	        countLetters(word);

	        sc.close();
	}

}
