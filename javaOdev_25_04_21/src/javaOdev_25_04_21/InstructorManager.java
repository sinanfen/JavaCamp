package javaOdev_25_04_21;

public class InstructorManager {

	public void Add(Instructor instructor) {
		System.out.println(instructor.instructorName+" "+instructor.instructorSurname+ "  Eklendi");
	}
	
	public void Delete(Instructor instructor) {
		System.out.println(instructor.instructorName+" "+instructor.instructorSurname+ " Silindi ");
	}
	
	public void Update(Instructor instructor) {
		System.out.println(instructor.instructorName+" "+instructor.instructorSurname+ " Güncellendi");
	}
	
	public void GetAll(Instructor[] instructors) {
		System.out.println("-------------");
		System.out.println("Eğitmenlerimiz");
		System.out.println("-------------");
		for(Instructor instructor:instructors) {
			System.out.println(instructor.instructorName+" "+instructor.instructorSurname);
		}
	}
}
