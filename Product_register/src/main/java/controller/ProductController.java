package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Product;
import serviceClass.ProductServiceImpl;

@RestController
@SpringBootApplication
public class ProductController {

	Map<String, Product> productList = new HashMap<String, Product>();
	ProductServiceImpl product= new ProductServiceImpl();
	
	@RequestMapping(value ="/addProduct", method =RequestMethod.POST)
	public @ResponseBody boolean addProduct(@RequestBody Product p ){
		return product.addProduct(p);
	}
	@RequestMapping(value="/deleteProduct/{id}", method = RequestMethod.GET)
	public @ResponseBody boolean deleteProduct(@PathVariable int id){
		return product.deleteProduct(id);
	}
	@RequestMapping(value="/searchProduct/{id}", method = RequestMethod.GET)
	public @ResponseBody Product searchProduct(@PathVariable ("id") String id){
		return product.searchProduct(Integer.parseInt(id));
	}
}
