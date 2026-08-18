package basics;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks = 96;

        if (marks >= 90) {
            System.out.println("Grade A");

         
            if (marks >= 95) {
                System.out.println("Outstanding");
            } else {
                System.out.println("Excellent");
            }

        } else if (marks >= 75) {
            System.out.println("Grade B");

        } else if (marks >= 50) {
            System.out.println("Grade C");

        } else {
            System.out.println("Fail");
        }
	}

}
