package basics;

public class SumNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int sum = 0;

	        for (int i = 1; i <= 50; i++) {

//	            sum = sum + i;
	            sum += i;
	        }

	        System.out.println("Sum = " + sum);
	}

}
