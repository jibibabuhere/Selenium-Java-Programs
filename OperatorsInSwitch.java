package basics;

public class OperatorsInSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int a = 4;
	        int b = 2;

	        String operator = "-";  
	        
	        
	        switch (operator) {

            case "+":
                System.out.println(a + " + " + b + " = " + (a + b));
                break;

            case "-":
                System.out.println(a + " - " + b + " = " + (a - b));
                break;

            case "*":
                System.out.println(a + " * " + b + " = " + (a * b));
                break;

            case "/":
                if (b != 0) {
                    System.out.println(a + " / " + b + " = " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }
	}

}
