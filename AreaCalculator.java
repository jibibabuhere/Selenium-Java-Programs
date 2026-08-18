// Create overloaded area() methods to calculate:•	Area of a square  •	Area of a rectangle •	Area of a circle


package polymorphism;

public class AreaCalculator {
	
	 
    void area(int side) {

        System.out.println("Area of Square = "+ (side * side));
    }

   
    void area(int length, int breadth) {

        System.out.println("Area of Rectangle = "+ (length * breadth));
    }


    void area(double radius) {

        System.out.println("Area of Circle = "
                + (3.14 * radius * radius));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  AreaCalculator obj = new AreaCalculator();

	    
	        obj.area(4);

	        obj.area(12, 8);

	        obj.area(4.0);
	}

}
