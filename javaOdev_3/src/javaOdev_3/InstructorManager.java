package javaOdev_3;

public class InstructorManager extends UserManager {

	public void createdCourse(Instructor instructor) {
		System.out.println("E�itmen: "+instructor.getFirstName()+" "+instructor.getLastName()+" "+instructor.getCreatedCourses()+" olu�turdu.");
	}
	
}
