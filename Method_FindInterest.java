package basics;

public class FindInterest {

	
	  static double calculateSimpleInterest(double p, double r, double t) {
	        return (p * r * t) / 100;
	    }
	  
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double principal = 2000;
	        double rate = 4;
	        double time = 1;

	        double result = calculateSimpleInterest(principal, rate, time);

	        System.out.println("Simple Interest = " + result);
		
		

	}

}
