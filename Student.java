package dersUcOdevIki;

public class Student extends User {

	String educationHeReceived;

	
	public Student(int id, String firstName, String lastName, String password, String educationHeReceived) {
		super(id, firstName, lastName, password);
		this.educationHeReceived = educationHeReceived;
	}
	
	
	public String getEducationHeReceived() {
		return educationHeReceived;
	}
	public void setEducationHeReceived(String educationHeReceived) {
		this.educationHeReceived = educationHeReceived;
	}
}
