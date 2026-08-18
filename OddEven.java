package basics;

public class OddEven {
	
	String oddOrEven(int num) {  
		if(num % 2 == 0) {
			return "Even";
				
			}
		else {
			return "odd";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OddEven obj = new OddEven();
		String result = obj.oddOrEven(3);
		System.out.println("The number is :"+result);

	}

}
