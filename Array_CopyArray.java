// Write a program to copy one array into another array
package array;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int arr1[] = {2, 4, 10, 21, 15, 33, 42};
	        int arr2[] = new int[arr1.length];  // Creates an empty array with the same size as arr1
	        for (int i = 0; i < arr1.length; i++) {

	            arr2[i] = arr1[i]; //Copy Elements
	        }

	        System.out.println("Original Array(arr):");

	        for (int i = 0; i < arr1.length; i++) {

	            System.out.print(arr1[i] + " ");
	        }
	        System.out.println("\n");

	        System.out.println("Copied Array(arr2):");

	        for (int i = 0; i < arr2.length; i++) {

	            System.out.print(arr2[i] + " ");
	        }

	}

}
