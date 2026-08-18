package abstraction;

import java.util.Scanner;

//Abstract class
abstract class MathsProgram {

 abstract int add(int a, int b);

 abstract int subtract(int a, int b);

 abstract int multiply(int a, int b);

 abstract int divide(int a, int b);
}

//Child class
class CalculationWork extends MathsProgram {

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

//Main class
public class CalculatorDemo {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     CalculationWork obj = new CalculationWork();

     System.out.print("Enter first number: ");
     int num1 = sc.nextInt();

     System.out.print("Enter second number: ");
     int num2 = sc.nextInt();

     System.out.print("Enter operator (+,-,*,/): ");
     char op = sc.next().charAt(0);

     switch (op) {

         case '+':
             System.out.println("Addition = "
                     + obj.add(num1, num2));
             break;

         case '-':
             System.out.println("Subtraction = "
                     + obj.subtract(num1, num2));
             break;

         case '*':
             System.out.println("Multiplication = "
                     + obj.multiply(num1, num2));
             break;

         case '/':
             System.out.println("Division = "
                     + obj.divide(num1, num2));
             break;

         default:
             System.out.println("Invalid Operator");
     }

     sc.close();
 }
}



