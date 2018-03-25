package productsservices.product;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ProductsController {
	
	@Autowired
	private Productsservice productsservice;
	
@RequestMapping(value= "/product", method = RequestMethod.GET)
	@GetMapping("/product")
	public List<Product> getproducts(){
		return productsservice.getproducts();
				}
	
    @RequestMapping(method = RequestMethod.GET,value="/product/{id}")
    public Product getproduct(@PathVariable String id) {
    	return productsservice.getproduct(id);
    			}
    
    @RequestMapping(method=RequestMethod.PUT, value="/product")
    public void addTopic(@RequestBody Product product)
    {
    	productsservice.addTopic(product);
 
    }
    
    @RequestMapping(method=RequestMethod.POST,  value="/product/{id}")
    public void updateproduct(@RequestBody Product product, @PathVariable String id)
    {
    	productsservice.updateproduct(id, product);
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/product/{id}")
    public void deleteproduct(@PathVariable String id) {
    	 productsservice.deleteproduct(id);
    			}
}
