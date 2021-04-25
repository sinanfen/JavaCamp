package javaOdev_25_04_21;

public class CategoryManager {

	public void Add(Category category) {
		System.out.println(category.categoryName+" Kategorisi Eklendi.");
	}
	
	public void Update(Category category) {
		System.out.println(category.categoryName+" Kategorisi G�ncellendi");
	}
	
	public void Delete(Category category) {
		System.out.println(category.categoryName+" Kategorisi Silindi");
	}
	
	public void GetAll(Category[] categories) {
		System.out.println("E�itim Kategorilerini �nceleyebilirsiniz..");
		
		
		System.out.println("Mevcut Kategoriler");
		for(Category category:categories) {
			
			System.out.println(category.categoryName);
		}
	}
	

}