package demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Product;
import serviceClass.ProductServiceImpl;

@RestController

public class Test {

	public ProductServiceImpl service = new ProductServiceImpl();
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
	public @ResponseBody boolean addProduct(@RequestBody Product product){
		return service.addProduct(product);
	}
	
}
