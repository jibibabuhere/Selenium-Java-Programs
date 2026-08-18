package basics;

import java.util.Scanner;

public class AvgMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		   Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter Student Name: ");
	        String name = sc.next();

	        System.out.print("Enter Roll Number: ");
	        int rollNumber = sc.nextInt();

	        System.out.print("Enter Phone Number: ");
	        long phoneNumber = sc.nextLong();

	      
	        System.out.print("Enter Mark 1: ");
	        int mark1 = sc.nextInt();

	        System.out.print("Enter Mark 2: ");
	        int mark2 = sc.nextInt();
	        
	        System.out.print("Enter Mark 3: ");
	        int mark3 = sc.nextInt();

	 
	        double average = (mark1 + mark2 + mark3) / 3;

	        
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Phone Number: " + phoneNumber);
	        System.out.println("Average Marks: " + average);

	        sc.close();
	        
	}

}
