// Find Maximum Number Overload max() methods to find: •	Maximum of 2 integers  •	Maximum of 3 integers  •	Maximum of 2 double values


package polymorphism;

public class LargestNumber {
	
	
    int max(int a, int b) {

        if (a > b) {

            return a;
        } else {

            return b;
        }
    }
    
    
    int max(int a, int b, int c) {

        if (a > b && a > c) {

            return a;

        } else if (b > c) {

            return b;

        } else {

            return c;
        }
    }
    
    
    double max(double a, double b) {

        if (a > b) {

            return a;
        } else {

            return b;
        }
    }
    
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LargestNumber obj = new LargestNumber();


	        int result1 = obj.max(5, 28);

	        int result2 = obj.max(10, 20, 30);

	        double result3 = obj.max(2.4, 3.6);

	        System.out.println("Maximum of 2 integers = "+ result1);

	        System.out.println("Maximum of 3 integers = "+ result2);

	        System.out.println("Maximum of 2 double values = "+ result3);

	}

}
