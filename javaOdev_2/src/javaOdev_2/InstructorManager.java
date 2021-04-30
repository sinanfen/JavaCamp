package javaOdev_2;

public class InstructorManager {

	public void addInstructor(Instructor egitmen) {
		System.out.println("E�itmen eklendi." + "\nId: "+ egitmen.id + "\nAd� Soyad�: " + egitmen.firstName + egitmen.lastName + "\nVerilen Kurs: " +egitmen.verilenKurs.name);
	}
	
	public void updateInstructor(Instructor egitmen) {
		System.out.println("E�itmen g�ncellendi." + "\nId: "+ egitmen.id + "\nAd� Soyad�: " + egitmen.firstName + egitmen.lastName + "\nVerilen Kurs: " +egitmen.verilenKurs.name);
	}
	
	public void infoInstructor(Instructor egitmen) {
		 System.out.println("* E�itmen Bilgisi*"
			        +"\nAd� Soyad�: "+ egitmen.firstName+ " " +egitmen.lastName
			        +"\nVerilen Kurs: "+ egitmen.verilenKurs.name);
	}
	
}
