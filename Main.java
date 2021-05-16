package dersUcOdevIki;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor =new Instructor(1, "Engin", "Demiroğ", "123456", "java");
		
		Student student = new Student(1, "Ünal", "Zehir", "987654", "java");
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(student);
		studentManager.doHomework(student);
		


	}

}
