package javaOdev_3;

public class StudentManager extends UserManager{
	
	public void selectCourse(Student student) {
		System.out.println("��renci: "+student.getFirstName()+" "+student.getLastName()+" "+student.getCurrentCourseName()+ " kursunu se�ti.");
	}
	
}
