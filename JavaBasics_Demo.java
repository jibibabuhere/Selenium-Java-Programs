package basics;



public class Demo {

	
	private String name;
	private int age;
	private int id;
	
	public void setname(String newname) {
		this.name = newname;
		
	}
	
	public void setage(int age) {
		this.age = age;
		
	}

	public void setid(int newid) {
		this.id = newid;
	}
	
	
	public String getname() {
		return name;
	}

	public int getage() {
		return age;
		
	}
	
	public int getid() {
		return id;
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	Demo obj = new Demo();
	obj.setname("jibi");
	obj.setage(25);
	obj.setid(10);
	System.out.println("name:"+obj.getname()+"\n"+"age:"+obj.getage()+"\n"+"id:"+obj.getid());
	
	

		
	
		
		
		

	
		
		
	
		
		
	
	
		
		
	
		
		
	}



}
 
