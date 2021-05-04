package javaOdev_3;

public class UserManager {
	public void Login(User user) {
		System.out.println(" Giriþ yapýldý: " +user.getFirstName());
	}
	
	public void Logout(User user) {
		System.out.println(" Çýkýþ yapýldý: " +user.getFirstName());
	}
}
