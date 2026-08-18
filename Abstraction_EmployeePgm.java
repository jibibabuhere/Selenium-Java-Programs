//	Write a program using an abstract class Employee with method calculateSalary(). Implement it for PermanentEmployee and ContractEmployee.
package abstraction;


abstract class Employee { //Abstract class


 abstract double calculateSalary();  // Abstract method
}


class PermanentEmployee extends Employee {

    double basicSalary = 30000;
    double HA = 5000;
    double PF = 2000;

    public double calculateSalary() {

        return basicSalary + HA - PF;
    }
}

class ContractEmployee extends Employee {

    double rate = 500;
    int hours = 8;

    public double calculateSalary() {

        return rate * hours;
    }
}
public class EmployeePgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  PermanentEmployee obj1 = new PermanentEmployee();

	        ContractEmployee obj2 = new ContractEmployee();

	        System.out.println("Permanent Employee Salary: " + obj1.calculateSalary());

	        System.out.println("Contract Employee Salary: " + obj2.calculateSalary());

	}

}
