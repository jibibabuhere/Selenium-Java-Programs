package inheritance; // multi level inheritance

class Student{
	void regno() {
		int regno = 34;
		System.out.println(regno);
	}
}


class mark extends Student{
	void exam() {
		String sub = "Maths";
		System.out.println(sub);
	}
}

class result extends mark{
	int mark = 75;
}
public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		result obj = new result();
		obj.regno();
		obj.exam();
		System.out.println(obj.mark);
	}

}
