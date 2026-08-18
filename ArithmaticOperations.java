package basic;

public class ArithmaticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 22;
		int b = 32;
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		float div = a / b ;
		float mod = a % b;
		
		System.out.println("Additon = " + sum);
		System.out.println("Subtraction = " + sub);
		System.out.println("Multiplication = " + mul);
		System.out.println("Divison = " + div);
		System.out.println("Modulus = " + mod);

    	System.out.println("\n");

		
		//circle
		double radius = 5;
		double circleArea = 3.14 * radius * radius;
		System.out.println("Area of Circle:"+ " " +circleArea);
		
		System.out.println("\n");
        // Triangle
        double breadth = 20;
        double height = 25;
        double triangleArea = 0.5 * breadth * height;
        System.out.println("Area of Triangle: " + triangleArea);

    	System.out.println("\n");
    	
    	  // Rectangle
        double length =15;
        double width = 10;
        double rectangleArea = length * width;
        System.out.println("Area of Rectangle: " + rectangleArea);
        
    	System.out.println("\n");

        // Square
        double side = 5;
        double squareArea = side * side;
        System.out.println("Area of Square: " + squareArea);
        
    	System.out.println("\n");
        // number swapping
        
        int x = 1;
        int y = 2;
        int temp;
        
        temp = x;
        x = y;
        y = temp;
        
        System.out.println("Values Swapped");
        System.out.println("a = " + x + ", b = " + y);
		
    	System.out.println("\n");
    	
    	
        // Comparison Operators 
        
        int num1 = 15;
        int num2 = 10;
        System.out.println("Comparison oparatoes");
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 >= num2: " + (num1 >= num2));
        System.out.println("num1 <= num2: " + (num1 <= num2));
        
    	System.out.println("\n");
        
        // Logical operators
        
        int p = 10;
        int q = 20;
        System.out.println("Logical oparators");
        // Logical AND  (both conditions must be true)
        System.out.println("AND: " + (p < q && q > 5));

        // Logical  OR (any one condition true)
        System.out.println("OR: " + (p > q || q > 5));

        // Logical NOT (reverse the result will be the output)
        System.out.println("NOT: " + !(p < q));
		
        System.out.println("\n");
        
        
        
        
    	
    	 System.out.println("Unary oparators");
    	 
    	 int number = 5;

         System.out.println("Post Increment: " + (number++)); // prints 5
         System.out.println("After Post Increment: " + number); // 6

         System.out.println("Pre Increment: " + (++number)); // 7

         System.out.println("Post Decrement: " + (number--)); // 7
         System.out.println("After Post Decrement: " + number); // 6

         System.out.println("Pre Decrement: " + (--number)); // 5
         
         
         
         
         
         System.out.println("Assignment oparators");
         System.out.println("\n");
         
         int value = 10;

         System.out.println("Initial value: " + value);

         value += 5;  // value = value + 5
         System.out.println("After += : " + value);

         value -= 3;  // value = value - 3
         System.out.println("After -= : " + value);

         value *= 2;  // value = value * 2
         System.out.println("After *= : " + value);

         value /= 4;  // value = value / 4
         System.out.println("After /= : " + value);

         value %= 3;  // value = value % 3
         System.out.println("After %= : " + value);
         
         
         
         
         
         
     
         
         String name = "Anusree";
         int age = 25;
         int rollNumber = 12;

         int mark1 = 75;
         int mark2 = 85;
         int mark3 = 88;
         int mark4 = 69;
         int mark5 = 78;

         int total = mark1 + mark2 + mark3 + mark4 + mark5;
         double average = total / 5;

         System.out.println("Student Name: " + name);
         System.out.println("Age: " + age);
         System.out.println("Roll Number: " + rollNumber);

         System.out.println("Average Marks: " + average);
    	 
	}

}
