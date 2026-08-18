package polymorphism;

public class Salary {
	
    void salary(int basicSalary) {

        System.out.println("Basic Salary = "+ basicSalary);
    }

    void salary(int basicSalary, int bonus) {

        System.out.println("Salary with Bonus = " + (basicSalary + bonus));
    }


    void salary(int basicSalary, int bonus, int overtime) {

        System.out.println("Salary with Bonus and Overtime = "
                + (basicSalary + bonus + overtime));
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salary obj = new Salary();
	      obj.salary(25000);
	        obj.salary(25000, 2000);
	        obj.salary(25000, 2000, 1500);

	}

}
