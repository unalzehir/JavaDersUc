package dersUcOdevIki;

public class StudentManager extends UserManager {
	
	public void doHomework(Student student) {
		System.out.println(student.getFirstName() + "Ödev yaptý.");
	}
	
}
