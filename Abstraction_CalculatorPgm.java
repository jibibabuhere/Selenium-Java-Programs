// Create an abstract class Calculator with abstract methods:•	add(int a, int b)•	subtract(int a, int b)•	multiply(int a, int b)•	divide(int a, int b)Create a subclass SimpleCalculator that implements all the above methods.Write a program to perform all arithmetic operations using the subclass object.


package abstraction;


abstract class Calculator { //Abstract class


 abstract int add(int a, int b);  // Abstract methods

 abstract int subtract(int a, int b);

 abstract int multiply(int a, int b);

 abstract int divide(int a, int b);
}



class SimpleCalculator extends Calculator {  //Subclass

 int add(int a, int b) {

     return a + b;
 }

 int subtract(int a, int b) {

     return a - b;
 }

 int multiply(int a, int b) {

     return a * b;
 }

 int divide(int a, int b) {

     return a / b;
 }
}

public class CalculatorPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 SimpleCalculator obj = new SimpleCalculator();

	        System.out.println("Addition = " + obj.add(2, 4));

	        System.out.println("Subtraction = " + obj.subtract(8, 4));

	        System.out.println("Multiplication = " + obj.multiply(2, 3));

	        System.out.println("Division = " + obj.divide(6, 3));

	}

}
