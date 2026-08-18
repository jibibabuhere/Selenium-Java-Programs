//Write a program that asks the user to enter a string and an index number. Display the character at the given index. Handle the StringIndexOutOfBoundsException if the user enters an index that is greater than the length of the string.
package EXCEPTION;

import java.util.Scanner;


public class StringExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        try {

	            System.out.print("Enter a string: ");
	            String text = sc.nextLine();

	            System.out.print("Enter an index number: ");
	            int index = sc.nextInt();

	            System.out.println("Character = " + text.charAt(index));

	        }

	        catch (StringIndexOutOfBoundsException e) {

	            System.out.println(e.getMessage());

	            e.printStackTrace();

	            System.out.println("Invalid Index. Index is out of range");

	        }

	        sc.close();

	}

}
