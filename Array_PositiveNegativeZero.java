//WRITE A PGM TO COUNT POSITIVE NEGATICE AND ZERO IN AN ARRAY

package array;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int arr[] = {10, -5, 0, 20, -8, 0, 15};

	        int positiveCount = 0;
	        int negativeCount = 0;
	        int zeroCount = 0;

	        for (int i = 0; i < arr.length; i++) {

	            if (arr[i] > 0) {

	                positiveCount++;

	            } else if (arr[i] < 0) {

	                negativeCount++;

	            } else {

	                zeroCount++;
	            }
	        }

	        System.out.println("Positive Numbers = " + positiveCount);
	        System.out.println("Negative Numbers = " + negativeCount);
	        System.out.println("Zeroes = " + zeroCount);

	}

}
