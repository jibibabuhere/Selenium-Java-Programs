package basics;

public class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programme to find the greatest number among three numbers
		
		 int num1 = 10;
	        int num2 = 25;
	        int num3 = 15;

	        if (num1 >= num2 && num1 >= num3) {
	            System.out.println("num1 is greatest: " + num1);
	        } 
	        else if (num2 >= num1 && num2 >= num3) {
	            System.out.println("num2 is greatest: " + num2);
	        } 
	        else {
	            System.out.println("num3 is greatest: " + num3);
	        }        
	}

}
