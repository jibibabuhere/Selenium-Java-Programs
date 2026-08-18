package array;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int arr[] = {10, 20, 30, 40, 50};

	        try {

	            System.out.println(arr[10]);

	        }

	        catch (ArrayIndexOutOfBoundsException e) {

	            System.out.println(e.getMessage());

	            e.printStackTrace();

	            System.out.println("Invalid Array Index");
	        }
	}

}
