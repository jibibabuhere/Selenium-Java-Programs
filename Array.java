package array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] xy = new int[10];
		
		int [] A = {1,4,5,8};
		System.out.println(A[2]);
		
		System.out.println(A.length);
		
		System.out.println(Arrays.toString(A));
		
		//for loopp example
		
		for (int i = 0; i< A.length; i++) {
			System.out.println(A[i]);
			
		}
		
		// foe each lopp example
		for (int num : A) {
			System.out.println(num);
		}
	}

}
