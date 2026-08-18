package hashset;
import java.util.HashSet;

public class RegisteredEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HashSet<String> registeredEmails = new HashSet<>();

	    
	        registeredEmails.add("jibi@gmail.com");
	        registeredEmails.add("anu@gmail.com");
	        registeredEmails.add("abhi@gmail.com");

	      
	        System.out.println("Registered Emails:");
	        System.out.println(registeredEmails);
	        
	        String email = "jibi@gmail.com";
	        if (registeredEmails.contains(email)) {

	            System.out.println("Email is registered");

	        } else {

	            System.out.println("Email is not registered");
	        }

	}

}
