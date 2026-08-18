package basics;

public class MethodWithReturn {  // if we create method with data type (int , string....) use "return"
	
	int add(int a, int b) {
		return a + b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodWithReturn obj = new MethodWithReturn();
		int result = obj.add(2, 4);
		System.out.println("SUM:"+result);

	}

}
