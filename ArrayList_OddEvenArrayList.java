package arraylist;

import java.util.ArrayList;

public class OddEvenArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<Integer> numbers = new ArrayList<>();

	        // Add 20 numbers
	        for (int i = 1; i <= 20; i++) {

	            numbers.add(i);
	        }

	        ArrayList<Integer> evenNumbers = new ArrayList<>();
	        ArrayList<Integer> oddNumbers = new ArrayList<>();

	        // Separate even and odd numbers
	        for (int num : numbers) {

	            if (num % 2 == 0) {

	                evenNumbers.add(num);

	            } else {

	                oddNumbers.add(num);
	            }
	        }

	        System.out.println("All Numbers: " + numbers);
	        System.out.println("Even Numbers: " + evenNumbers);
	        System.out.println("Odd Numbers: " + oddNumbers);

	}

}
