package dersUcOdevIki;

public class InstructorManager extends UserManager{
	
	public void addHomework(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " Ödev ekledi.");
	}
}
