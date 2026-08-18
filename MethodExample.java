package basics;

public class MethodExample {  // pgm using void, only for perform task  ie-  printing using system.out.println
	
	void add() {
		int a = 20, b =10;
		int sum = a + b;
		System.out.println("Sum:"+ sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MethodExample m = new MethodExample();
		m.add();

	}

}
