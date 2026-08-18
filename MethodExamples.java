//package basics;   // 1. method with void
//
//public class MethodExamples {
//	
//	void add() {
//		int a= 10,  b= 20;
//		int sum = a+b;
//		System.out.println(sum);
//		
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		MethodExamples obj = new MethodExamples();
//		obj.add();
//
//	}
//
//}




//package basics;  // 2. method with void and static. when using static no need to create object.
//
//public class MethodExamples {
//	
//	static void add() {
//		int a= 10, b= 20;
//		int sum = a+b;
//		System.out.println(sum);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		add();
//
//	}
//
//}




package basics; // method using parameter or arguments

public class MethodExamples {
	
	static void add(int a, int b) {
		int sum = a+ b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(20,20);

	}

}





