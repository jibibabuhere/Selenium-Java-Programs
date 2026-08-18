//Write a pgm to count even and odd number in the array

package array;

public class OddEvenCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int AB[] = {2, 5, 21, 13, 34, 19, 41, 26};
		 
		 
		 int oddNumberCount = 0;
	        int evenNumberCount = 0;
	        

	        for (int i = 0; i < AB.length; i++) {

	            if (AB[i] % 2 == 0) {

	            	evenNumberCount++;

	            } else {

	            	oddNumberCount++;
	            }
	        }

	        System.out.println("Number of Even Elements = " + evenNumberCount);
	        System.out.println("Number of Odd Elements = " + oddNumberCount);

	}

}
