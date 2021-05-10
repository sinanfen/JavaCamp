package kodlamaio.northwind.business.concretes;

import java.util.List;

import kodlamaio.northwind.business.abstracts.Product;
import kodlamaio.northwind.business.abstracts.ProductService;

public class ProductManager implements ProductService {
	
	private ProductDao productDao;

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
