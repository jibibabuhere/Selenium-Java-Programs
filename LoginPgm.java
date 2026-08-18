package basics;

import java.util.Scanner;

public class LoginPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner sc = new Scanner(System.in);

	     
	        String savedUser = "admin";
	        
	        String savedPass = "12345";

	        System.out.print("Enter User Name: ");
	        String userInput = sc.nextLine();

	        System.out.print("Enter Password: ");
	        
	        String passInput = sc.nextLine();

	        if (userInput.equals(savedUser) && passInput.equals(savedPass)) {
	            System.out.println("Login Successful");
	        } else {
	            System.out.println("Login Failed");
	        }

	        sc.close();

	}

}
