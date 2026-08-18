package polymorphism;


public class MethodOverloading {   // method overloading = same method with different parameters and different data type 
	
	public int add(int a, int b) { // first add method
		return a+ b;
		
	}
	
	public int add (int a, int b, int c) { // second add method
		return a + b+ c;
	}
	
	
	public double add(double a, double b) { // third add method
		return a + b;
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading m = new MethodOverloading();
		System.out.println(m.add(8, 8));
		
		System.out.println(m.add(8,8,8));

	}

}
