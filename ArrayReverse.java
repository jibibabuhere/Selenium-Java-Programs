package array;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int arr[] = {10, 15, 20, 25, 18};

	        System.out.println("Array before reverse:");
	        System.out.println(Arrays.toString(arr));

//	        for (int i = 0; i < arr.length; i++) {
//	            System.out.print(arr[i] + " ");
//	        }

	 

	        System.out.println("Array after Reverse:");

	        for (int i = arr.length - 1; i >= 0; i--) {
	            System.out.print(arr[i] + " ");

	        }

	}

}
