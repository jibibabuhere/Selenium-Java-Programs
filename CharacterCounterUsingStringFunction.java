package basics;


import java.util.Scanner;

public class CharacterCounterUsingStringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String text = sc.nextLine();

	        int totalCharacters = text.length();

	        int spaces = totalCharacters - text.replace(" ", "").length();

	        int digits = text.replaceAll("[^0-9]", "").length();

	        int letters = text.replaceAll("[^a-zA-Z]", "").length();

	        System.out.println("Total Characters: " + totalCharacters);
	        System.out.println("Letters: " + letters);
	        System.out.println("Digits: " + digits);
	        System.out.println("Spaces: " + spaces);

	        sc.close();
	}

}
