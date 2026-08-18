package basics;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int number = 245;
	        int count = 0;

	        while (number > 0) {
	            number = number / 10;  // remove last digit
	            count++;              // increase count
	        }

	        System.out.println("Number of digits = " + count);

	}

}
