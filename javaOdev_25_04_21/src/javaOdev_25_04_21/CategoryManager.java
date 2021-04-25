package javaOdev_25_04_21;

public class CategoryManager {

	public void Add(Category category) {
		System.out.println(category.categoryName+" Kategorisi Eklendi.");
	}
	
	public void Update(Category category) {
		System.out.println(category.categoryName+" Kategorisi Güncellendi");
	}
	
	public void Delete(Category category) {
		System.out.println(category.categoryName+" Kategorisi Silindi");
	}
	
	public void GetAll(Category[] categories) {
		System.out.println("Eğitim Kategorilerini İnceleyebilirsiniz..");
		
		
		System.out.println("Mevcut Kategoriler");
		for(Category category:categories) {
			
			System.out.println(category.categoryName);
		}
	}
	

}
