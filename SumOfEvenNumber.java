package basics;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int num = 10;   // given number
	        int i = 1;
	        int sum = 0;

	        while (i <= num) {
	            if (i % 2 == 0) {
	                sum = sum + i;
	            }
	            i++;
	        }

	        System.out.println("Sum of even numbers from 1 to " + num + " is: " + sum);

	}

}
