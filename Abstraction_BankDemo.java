// Design an abstract class Bank with an abstract method getInterestRate(). Create subclasses like SBI, HDFC, and ICICI.

package abstraction;



abstract class Bank {  //Abstract class


 abstract double getInterestRate();  // Abstract method with double return type
}


class SBI extends Bank {

 public double getInterestRate() {

     return 6.7;
 }
}


class HDFC extends Bank {

 public double getInterestRate() {

     return 4.7;
 }
}


class ICICI extends Bank {

 double getInterestRate() {

     return 9.7;
 }
}

public class BankDemo {

 public static void main(String[] args) {

     SBI obj1 = new SBI();
     HDFC obj2 = new HDFC();
     ICICI obj3 = new ICICI();

     System.out.println("SBI Interest Rate: " + obj1.getInterestRate());

     System.out.println("HDFC Interest Rate: " + obj2.getInterestRate());

     System.out.println("ICICI Interest Rate: " + obj3.getInterestRate());
 }
}
