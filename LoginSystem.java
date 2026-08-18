package exception;

import java.util.Scanner;

public class LoginSystem {

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter Username: ");
		        String username = sc.nextLine();

		        System.out.print("Enter Password: ");
		        String password = sc.nextLine();

		        if (username.isEmpty() || password.isEmpty()) {

		            sc.close();  // close before throwing exception

		            throw new Exception("Username or Password cannot be empty");
		        }

		        System.out.println("Login Successful");

		        sc.close();

	}

}
