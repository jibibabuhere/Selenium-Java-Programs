//Write a program to find the smallest element in an array using for-each-loop
package array;

public class FindSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        int arr[] = {15, 12, 9, 33, 25, 3, 17};

        int smallest = arr[0];

        for (int num : arr) {

            if (num < smallest) {

                smallest = num;
            }
        }

        System.out.println("Smallest Element is:" + smallest);

	}

}
