package encapsulation;

public class BankAccount {
	
	  // Private variables
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Setter methods
    public void setAccountNumber(int accNo) {
        this.accountNumber = accNo;
    }

    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Deposited: " + amount);
    }
    
    // Withdraw method
    public void withdraw(double amount) {

        if (amount <= balance) {

            balance = balance - amount;

            System.out.println("Withdrawn: " + amount);

        } else {

            System.out.println("Insufficient Balance");
        }
    }

    // Get balance method
    public double getBalance() {
        return balance;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  BankAccount acc = new BankAccount();

	        acc.setAccountNumber(101);
	        acc.setAccountHolderName("Arun");
	        acc.setBalance(5000);

	        System.out.println("Initial Balance: " + acc.getBalance());

	        acc.deposit(2000);
	        System.out.println("Balance: " + acc.getBalance());

	        acc.withdraw(3000);
	        System.out.println("Balance: " + acc.getBalance());

	        acc.withdraw(5000);

	}

}
