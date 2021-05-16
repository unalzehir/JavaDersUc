package dersUcOdevIki;

public class Instructor extends User {
	
	String herEducation;
	
	
	public Instructor(int id, String firstName, String lastName, String password, String herEducation) {
		super(id, firstName, lastName, password);
		this.herEducation = herEducation;
	}
	
	
	public String getHerEducation() {
		return herEducation;
	}
	public void setHerEducation(String herEducation) {
		this.herEducation = herEducation;
	}
}
