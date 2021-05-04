package javaOdev_3;

public class Instructor extends User {

	public Instructor(int id, String firstName, String lastName, String createdCourses) {
		super(id, firstName, lastName);
		this.createdCourses = createdCourses;
	}
	
	private String createdCourses;

	public String getCreatedCourses() {
		return createdCourses;
	}

	public void setCreatedCourses(String createdCourses) {
		this.createdCourses = createdCourses;
	}
	


	
}
