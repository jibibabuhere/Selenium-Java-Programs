// Create an ATM Class.Private field: balance.Methods:.deposit(double amount).withdraw(double amount).checkBalance().Withdrawal should fail if the amount exceeds the available balance..Balance should never be directly accessible from outside the class.

package encapsulation;

public class ATM {
	
	 // Private variable
    private double balance;

    // Deposit method
    public void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Deposited Amount: " + amount);
    }

    // Withdraw method
    public void withdraw(double amount) {

        if (amount <= balance) {

            balance = balance - amount;

            System.out.println("Withdrawn Amount: " + amount);

        } else {

            System.out.println("Insufficient Balance");
        }
    }
    // Check balance method
    public void checkBalance() {

        System.out.println("Current Balance: " + balance);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ATM atm = new ATM();

	        atm.deposit(5000);

	        atm.checkBalance();

	        atm.withdraw(2000);

	        atm.checkBalance();

	        atm.withdraw(4000);

	        atm.checkBalance();

	}

}
