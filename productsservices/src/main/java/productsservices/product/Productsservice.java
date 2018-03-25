package productsservices.product;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Productsservice {
	
	@Autowired
private	ProductRepository productrepository;
public List<Product> getproducts(){
         List<Product> products = new ArrayList<>();
         productrepository.findAll().forEach(products::add);
         return products;
			}

public Product getproduct(String id)
{
	return productrepository.findOne(id);
}

public void addTopic(Product product) {
	
	productrepository.save(product);
}

public void updateproduct(String id, Product product) {
	
	productrepository.save(product);
	
}

public void deleteproduct(String id) {
	productrepository.delete(id);
	
}



}
