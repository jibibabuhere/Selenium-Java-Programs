// Write a method divide Numbers (int a, int b) that divides two integers.	Use a try-catch block to handle the case where b is zero and print an appropriate error message ("Division by zero is not allowed").NullPointerException	Write a method printStringLength(String str) that prints the length of a string.	Use a try-catch block to handle the case where str is null and print an appropriate error message ("String is null").	Main Method:	Call the divideNumbers () method with b = 0 to trigger an Arithmetic Exception.	Call the printStringLength () method with a null string to trigger a NullPointerException

package EXCEPTION;

public class ExceptionMethods {
	

    static void divideNumbers(int a, int b) {   	  

        try {

            System.out.println("Result = " + (a / b));

        }

        catch (ArithmeticException e) {

            System.out.println(e.getMessage());

            e.printStackTrace();

            System.out.println("Division by zero is not allowed");
        }
    }

    
 
    static void printStringLength(String str) {

        try {

            System.out.println("Length = " + str.length());

        }

        catch (NullPointerException e) {

            System.out.println(e.getMessage());

            e.printStackTrace();

            System.out.println("String is null");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        divideNumbers(4, 0);
        printStringLength(null);
	}

}
