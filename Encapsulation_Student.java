// Create a Student class:Private fields: name, marks.Setter should only accept marks between 0 and 100.Getter methods to access data.Method calculateGrade():.A: 90–100.B: 80–89.C: 70–79.D: 60–69.F: Below 60

package encapsulation;

public class Student {
    private String name;   	// Private variables
    private int marks;

    public void setName(String newName) {       // Setter for name
        this.name = newName;
    }

    public void setMarks(int newMarks) {      // Setter for marks

        if (newMarks >= 0 && newMarks <= 100) {
            this.marks = newMarks;
        } else {
            System.out.println("Marks should be between 0 and 100");
        }
    }
    

    public String getName() {       // Getter methods
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String calculateGrade() {      // Method to calculate grade

        if (marks >= 90) {
            return "A";
        }

        else if (marks >= 80) {
            return "B";
        }

        else if (marks >= 70) {
            return "C";
        }

        else if (marks >= 60) {
            return "D";
        }

        else {
            return "F";
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student st = new Student();
	        st.setName("Arun");
	        st.setMarks(85);

	        System.out.println("Name: " + st.getName());
	        System.out.println("Marks: " + st.getMarks());
	        System.out.println("Grade: " + st.calculateGrade());
	}

}
