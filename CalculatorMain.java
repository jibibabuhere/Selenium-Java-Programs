package basics;

import java.util.Scanner;



public class CalculatorMain implements Calculator{
	
	public double add(int a,int b) {
		return a + b;
		
	}
	
	
	public double sub(int a,int b) {
		return a - b;
	}

	
	public double mul(int a,int b) {
		return a * b;
		
	}
	
	public double div(int a, int b) {
		return a / b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Calculator obj = new CalculatorMain();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		
		System.out.println("Choode the operatoe(+,-,*,/)");
		char op = sc.next().charAt(0);
		
		double res;
		
		switch(op) {
		
		case '+':
			res = obj.add(num1,num2);
			System.out.println("Addition="+res);
			break;
			
		case '-':
			res= obj.sub(num1,num2);
			System.out.println("Subtraction:"+res);
			break;
			
		case '*':
			res= obj.mul(num1,num2);
			break;
		
		case '/':
			res=obj.div(num1,num2);
			break;
			
		default:
			System.out.println("Invalid choice");
			
		}
		sc.close();		
		

	}

}
