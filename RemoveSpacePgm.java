package basics; // simple inheritance pgm

import java.util.Scanner;

public class RemoveSpacePgm {

	 static void removeSpace(String text) {

	        String result = text.replaceAll(" ", "");

	        System.out.println("After removing spaces: " + result);
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String word = sc.nextLine();
	        removeSpace(word);

	        sc.close();

	}

}




//class Student{    // super class
//	void regno() {
//		int regno = 34; // methid of super class
//		System.out.println(regno);  // code to execute
//	}
//}
//
//
//class marks extends Student{  // inherite from student class this is sub class
//	void exam() {
//		String sub="Maths";
//		System.out.println(sub);
//	}
//}