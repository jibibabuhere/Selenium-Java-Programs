package basics;

public class ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
//		Simple if 
		
		String role = "Admin";
		if(role == "Admin") {
			System.out.println("Simple If");
			System.out.println("The role is Admin");
			
			System.out.println("\n");
			
		}
		// if else statement
		System.out.println("If else");
		String position = "Admin";
		if(position == "Tester") {
			
			System.out.println("The role is Admin");
			
		}
		
		else {
			System.out.println("The role is Tester");
		}
		
		
		
		System.out.println("New program");
		int num = 25;
		
		if(num>=0) {
			System.out.println("The number is posttive");
		}
		else {
			System.out.println("The number is negative");
		}
		
		
		
		System.out.println("Voting!!");
		int age = 17;
		if(age >= 18) {
			System.out.println("The person is eligible for vote");
		}
		else {
			System.out.println("The person is not eligible for vote");
		}

		
		
		
		
		System.out.println("Check Odd or Even");
		int value = 34;
		if( value % 2 == 0) {
			System.out.println("The number is Even");
		}
		else {
			System.out.println("The number is Odd");
			
		}
		
		
		
		System.out.println("Blood Donation");
		int donarAge = 27;
		int Donarweight = 48;
		if (donarAge >= 20 && Donarweight >=40) {
			System.out.println("Eligible for blood donation");
		}
		else {
			System.out.println("Not Eligible for blood donation");
		}
		
		
		
		System.out.println("Vowel or not");
		 char letter = 'o';

	        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
	            letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {

	            System.out.println("Letter is a Vowel");
	        } else {
	            System.out.println("Letter is not a Vowel");
	        }
	        
	        
	        
	        System.out.println("Leap year or not");
	        int year = 2026;

	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            System.out.println("Leap Year");
	        } else {
	            System.out.println("Not a Leap Year");
	        }
	}
}
