package javaOdev_2;

public class Instructor {
	int id;
	String firstName;
	String lastName;
	Course verilenKurs;
	
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, Course verilenKurs) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.verilenKurs = verilenKurs;
				
	}
	
	
}
