package basics;

public class AreaFinding {
	
	
    void circleArea() {
        double radius = 3;
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }


    void squareArea() {
        double side = 2;
        double area = side * side;
        System.out.println("Area of Square = " + area);
    }
    

    static void rectangleArea() {
        double length = 6;
        double width = 4;
        double area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }

    
    static void triangleArea() {
        double base = 4;
        double height = 5;
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AreaFinding obj = new AreaFinding();

	        obj.circleArea();
	        obj.squareArea();

	        rectangleArea();
	        triangleArea();

	}

}
