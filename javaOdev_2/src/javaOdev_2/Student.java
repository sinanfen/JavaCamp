package javaOdev_2;

public class Student {
	int id;
	String firstName;
	String lastName;
	Instructor ogrInstructor;

	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, Instructor ogrInstructor) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ogrInstructor = ogrInstructor;
	}


}
