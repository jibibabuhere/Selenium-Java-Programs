package Interface;

import java.util.Scanner;

public class Calculator_Main implements Calculator {

    public double add(double a, double b) {

        return a + b;
    }

    public double sub(double a, double b) {

        return a - b;
    }

    public double mul(double a, double b) {

        return a * b;
    }

    public double div(double a, double b) {

        return a / b;
    }

    public static void main(String[] args) {

        // Interface reference object
        Calculator d = new Calculator_Main();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number");
        double num2 = sc.nextDouble();

        System.out.println("Enter Operator (+,-,*,/)");
        String op = sc.next();

        double res;

        switch (op) {

            case "+":

                res = d.add(num1, num2);

                System.out.println("Addition = " + res);
                break;

            case "-":

                res = d.sub(num1, num2);

                System.out.println("Subtraction = " + res);
                break;

            case "*":

                res = d.mul(num1, num2);

                System.out.println("Multiplication = " + res);
                break;

            case "/":

                res = d.div(num1, num2);

                System.out.println("Division = " + res);
                break;

            default:

                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}

