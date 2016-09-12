package beans;

import entity.Product;

/**
 * Interface to define the methods to add,delete,search and get products from the cart.
 * @author Surabhi_Natu
 *
 */
public interface ProductService {
	
	public boolean addProduct(Product p);

	public boolean deleteProduct(int id);

	public Product searchProduct(int id);

	//public List<Product> getAllProducts();
}
