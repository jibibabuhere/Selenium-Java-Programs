//Write a program to merge two arrays in Java 

package array;

public class ArrayMerging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr1[] = {10, 12,14, 14,18,20};

	        int arr2[] = {30, 32,36, 38, 40};

	        int mergedArray[] = new int[arr1.length + arr2.length];

	      
	        for (int i = 0; i < arr1.length; i++) {   //  // Copy first array

	        	mergedArray[i] = arr1[i];
	        }

	     
	        for (int i = 0; i < arr2.length; i++) { ///// // Copy second array

	        	mergedArray[arr1.length + i] = arr2[i];
	        }

	        System.out.println("Merged Array:");

	        for (int i = 0; i < mergedArray.length; i++) {

	            System.out.print(mergedArray[i] + " ");
	        }

	}

}
