package basics;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a Java program to:Check if a number is positive or negativeIf positive:Check if it is even or oddIf negative:Print "Negative number"If zero:Print "Zero"Use nested if statements.
		 
		
		int number = 8;

	        if (number > 0) {
	            System.out.println("Positive number");

	          
	            if (number % 2 == 0) {
	                System.out.println("Even number");
	            } else {
	                System.out.println("Odd number");
	            }

	        } else if (number < 0) {
	            System.out.println("Negative number");

	        } else {
	            System.out.println("Zero");
	        }
	}

}
