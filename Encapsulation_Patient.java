// Hospital Patient RecordCreate a Patient class:Private fields: patientId, name, ageAge must be between 0 and 120Provide getter and setter methodsDisplay patient information


package encapsulation;

public class Patient {

	  // Private variables
    private int patientId;
    private String name;
    private int age;

    // Setter for patientId
    public void setPatientId(int newId) {
        this.patientId = newId;
    }

    // Setter for name
    public void setName(String newName) {
        this.name = newName;
    }

    // Setter for age
    public void setAge(int newAge) {

        if (newAge >= 0 && newAge <= 120) {
            this.age = newAge;
        } else {
            System.out.println("Age must be between 0 and 120");
        }
    }
    // Getter methods
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Patient p = new Patient();

	        p.setPatientId(101);
	        p.setName("Arun");
	        p.setAge(25);

	        System.out.println("Patient ID: " + p.getPatientId());
	        System.out.println("Patient Name: " + p.getName());
	        System.out.println("Patient Age: " + p.getAge());

	}

}
