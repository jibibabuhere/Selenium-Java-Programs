//  Create overloaded login() methods:•	Login with username and password •	Login with mobile number and OTP •	Login with email, password


package polymorphism;

public class Login {
	
    void login(String username, String password) {

        if (username.equals("admin") && password.equals("12345")) {

            System.out.println("Login Successful using Username");
        } else {

            System.out.println("Login Failed");
        }
    }

   
    void login(long mobilenumber, int otp) {

        if (mobilenumber == 9999999999L && otp == 1234) {

            System.out.println("Login Successful using Mobile Number");
        } else {

            System.out.println("Login Failed");
        }
    }

  
    void login(String email, String password, int val) {      // added extra demo variable " val "to  make an difference from first login method ( login using email and password)

        if (email.equals("abc@gmail.com") && password.equals("abcd123")) {

            System.out.println("Login Successful using Email");
        } else {

            System.out.println("Login Failed");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Login obj = new Login();

	      
	        obj.login("admin", "12345");

	        obj.login(9999999999L, 1234);

	        obj.login("abc@gmail.com", "abcd123", 1);

	}

}
