package javaOdev_3;

public class UserManager {
	public void Login(User user) {
		System.out.println(" Giri� yap�ld�: " +user.getFirstName());
	}
	
	public void Logout(User user) {
		System.out.println(" ��k�� yap�ld�: " +user.getFirstName());
	}
}
