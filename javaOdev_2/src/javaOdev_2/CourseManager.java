package javaOdev_2;

public class CourseManager {

	public void addCourse(Course kurs) {
		System.out.println("Kurs eklendi." + "\nId: " + kurs.id + "\nKurs Ad�: " + kurs.name);
		
	}
	
	public void deleteCourse(Course kurs) {
		System.out.println("Kurs silindi." + "\nId: " + kurs.id + "\nKurs Ad�: " + kurs.name);
	}
}
