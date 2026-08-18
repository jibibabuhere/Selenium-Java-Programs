package basics;

public class VariableTypes {
	
	int a = 90; // Global variable / instance variable
	
	static int z = 900; // static variable
	
	void sum() {
		int a = 87, b= 87; // local variables
		System.out.println((a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VariableTypes j = new VariableTypes();  
		System.out.println(j.a); // access global variable using object
		
		System.out.println(z);  // access static variable - no need of object
		j.sum(); // access 
		

	}

}
