package javaOdev_25_04_21;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Category category1 = new Category();
		category1.id=1;
		category1.categoryName="Yaz�l�m";
				
		Category category2 = new Category();
		category2.id =2;
		category2.categoryName="G�venlik";
				
		Category category3 = new Category();
		category3.id =3;
		category3.categoryName="Bilim";

		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiro�");
		Instructor instructor2 = new Instructor(2, "Can", "De�er");
		Instructor instructor3 = new Instructor(3, "�a�r� Mert", "Bak�rc�");
		
	
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.Add(category1);
		categoryManager.Add(category2);
		categoryManager.Add(category3);
		System.out.println("-------------------------------");	
		
		Category[] categories = { category1,category2,category3};
		categoryManager.GetAll(categories);
		
		System.out.println("-------------------------------");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.Add(instructor1);
		instructorManager.Add(instructor2);
		instructorManager.Add(instructor3);
		Instructor[] instructors = {instructor1,instructor2,instructor3};
		instructorManager.GetAll(instructors);
		
		
	}

}
