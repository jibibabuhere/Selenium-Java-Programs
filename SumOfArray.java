// write a pgm to find sum of elements in the array
package array;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int A[] = {15, 8, 12, 9};

	        int sum = 0;

	        for (int i = 0; i < A.length; i++) {

	            sum = sum + A[i];
	        }

	        System.out.println("Sum of array elements = " + sum);

	}

}
