package basics;

public class CheckStringFunctions {

	
	 static void checkString(String text) {

	        System.out.println("Contains Good: " + text.contains("Good"));
	        System.out.println("Starts with Hii: " + text.startsWith("Hii"));
	        System.out.println("Ends with Morning: " + text.endsWith("Morning"));
	        System.out.println("Position of Good: " + text.indexOf("Good"));
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String word = "Hii Good Morning";
	        checkString(word);
	        

	}

}
