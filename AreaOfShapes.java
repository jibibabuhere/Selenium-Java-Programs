package basics;

public class AreaOfShapes {
	
	
	  void circleArea(double radius) {
	        double area = 3.14 * radius * radius;
	        System.out.println("Area of Circle = " + area);
	    }


	    void squareArea(double side) {
	        double area = side * side;
	        System.out.println("Area of Square = " + area);
	    }
	    
	    
	    

	    static void rectangleArea(double length, double width) {
	        double area = length * width;
	        System.out.println("Area of Rectangle = " + area);
	    }


	    static void triangleArea(double base, double height) {
	        double area = 0.5 * base * height;
	        System.out.println("Area of Triangle = " + area);
	    }
	    
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AreaOfShapes obj = new AreaOfShapes();

	       
	        obj.circleArea(5);
	        obj.squareArea(4);

	   
	        rectangleArea(6, 3);
	        triangleArea(4, 5);
		

	}

}
