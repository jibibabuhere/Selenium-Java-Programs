// Write a program that asks the user to enter an integer value. Handle the exception that occurs if the user enters a non-integer value (like a character or string).

package EXCEPTION;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);

	        try {

	            System.out.print("Enter an integer: ");

	            int num = sc.nextInt();

	            System.out.println("You entered: " + num);

	        }

	        catch (Exception e) {
	        	System.out.println(e.getMessage());
	        	e.printStackTrace();

	            System.out.println("its not an integer. Please enter a valid integer.");

	        }

	        sc.close();

	}

}
