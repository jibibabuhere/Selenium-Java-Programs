package basics;


import java.util.Scanner;

public class VowelsConsonantCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String word = sc.nextLine();

	        int vowels = 0;
	        int consonants = 0;

	        for (int i = 0; i < word.length(); i++) {

	            char letter = word.charAt(i);

	            if (letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z') {

	                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
	                    letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {

	                    vowels++;

	                } else {

	                    consonants++;
	                }
	            }
	        }

	        System.out.println("Number of vowels: " + vowels);
	        System.out.println("Number of consonants: " + consonants);

	        sc.close();

	}

}
