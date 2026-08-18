package basics;


import java.util.Scanner;

public class CharacterCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String text = sc.nextLine();

	        int letters = 0;
	        int digits = 0;
	        int spaces = 0;

	        for (int i = 0; i < text.length(); i++) {

	            char character = text.charAt(i);

	            if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
	                letters++;
	            }

	        
	            else if (character >= '0' && character <= '9') {
	                digits++;
	            }

	         
	            else if (character == ' ') {
	                spaces++;
	            }
	        }

	        System.out.println("Number of letters: " + letters);
	        System.out.println("Number of digits: " + digits);
	        System.out.println("Number of spaces: " + spaces);

	        sc.close();

	}

}
