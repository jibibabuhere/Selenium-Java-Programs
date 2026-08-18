package inheritance; // simple inheritance

class First{
	void concat() { // parent class / super class
		String s = "techmindz", c = "koci";
		System.out.println(s.concat(c));
	}
}
public class Inheritance_demo extends First { // subclass / child class

	
	void square() {
		int a= 90;
		System.out.println((a*a));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inheritance_demo i = new Inheritance_demo();
		i.concat();
		i.square();
		
		

	}

}
