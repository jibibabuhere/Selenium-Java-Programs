package basics;

public class ATMPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int balance = 10000;
	        int choice = 2;  
	        switch (choice) {

	            case 1:
	                System.out.println("Balance:" + balance);
	                break;

	            case 2:
	                int deposit = 5000;
	                balance = balance + deposit;
	                System.out.println("Deposited Amount:" + deposit);
	                System.out.println("Balance After Deposite:" + balance);
	                break;

	            case 3:
	                int withdraw = 10000;

	                if (withdraw <= balance) {
	                    balance = balance - withdraw;
	                    System.out.println("Withdrawn:" + withdraw);
	                    System.out.println("Balance After Withdrawn:" + balance);
	                } else {
	                    System.out.println("Not enough balance");
	                }
	                break;

	            case 4:
	                System.out.println("Exit");
	                break;

	            default:
	                System.out.println("Invalid choice");
	        }

	}

}
