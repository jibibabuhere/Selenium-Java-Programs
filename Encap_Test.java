package encapsulation;

public class Encap_Test {
	
	private String name; // declaring private variables
	private int age;  // cannot give values here directly. also cannot modify or access. wrapping variables in a class. we can access and set the values only through get() and set()
	private int id;

	
	public void setname(String newname) {   // creating set methods. we have 3 variables. so we will have 3 get() methods
		this.name = newname; // this.name = private variable name.  name = parameter name
		
	}
	
	public void setage(int age) {
		this.age = age;
	}
	
	public void setid(int newid) {
		id = newid;
	}
	
	public String getname() {  // creating get methods. we have 3 variables. so we will have 3 get methods
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	public int  getid() {
		return id;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encap_Test en = new Encap_Test ();  // creating object for the class . inside this class we wrap everything. 
		
		en.setname("Arun");
		en.setage(23);
		en.setid(2);
		
		System.out.println("Name:"+ en.getname()+ "\n" + "Age:" + en.getage()+ "\n" + "Id:"+en.getid());	

	}

}
