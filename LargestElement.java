// Write a program to find the largest element in an array using for-each-loop

package array;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     int arr[] = {21, 8, 10, 12, 31, 67};

	        int largestNumber = arr[0];

	        for (int num : arr) {

	            if (num > largestNumber) {

	            	largestNumber = num;
	            }
	        }

	        System.out.println("Largest Element = " + largestNumber);
	}

}
