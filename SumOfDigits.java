package basics;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 245;
	        int sum = 0;

	        while (num > 0) {

	            int lastDigit = num % 10;   // get last digit
	            sum = sum + lastDigit;        // add to sum
	            num = num / 10;     // remove last digit
	        }

	        System.out.println("Sum of digits = " + sum);

	}

}
