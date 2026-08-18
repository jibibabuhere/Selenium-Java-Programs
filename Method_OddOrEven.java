package basics;

public class OddOrEven {
	
    static String oddEven(int num) {  // using static . no need to create object.
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        int number = 5;

        String result = oddEven(number);

        System.out.println("The given number is " + result);

	}

}
