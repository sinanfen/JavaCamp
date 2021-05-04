package javaOdev_3;

public class Student extends User {
	public Student(int id, String firstName, String lastName, String currentCourseName) {
		super(id, firstName, lastName);
		this.currentCourseName = currentCourseName;
	}
	
	private String currentCourseName;

	public String getCurrentCourseName() {
		return currentCourseName;
	}

	public void setCurrentCourseName(String currentCourseName) {
		this.currentCourseName = currentCourseName;
	}
	

}
