package EXCEPTION;

//import java.util.inputMismatchException;
import java.util.Scanner;

public class ExceptionHandling1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn = new Scanner(System.in);
		
		try {
			System.out.println("enter a number:");
			int num = sn.nextInt();
			System.out.println(100/num);
		}
		
		catch (Exception a){
			System.out.println(a.getMessage());
			a.printStackTrace();
			System.out.println("invalid data");
		}

	}

}
