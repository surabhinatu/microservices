package serviceClass;

import java.util.HashMap;
import java.util.Map;

import beans.ProductService;
import entity.Product;
/**
 * Service implementation of the Product interface 'ProductService'. 
 * Customer can add,delete,search and get the products of the cart.
 * 
 * @author Surabhi_Natu
 *
 */
public class ProductServiceImpl implements ProductService{
	
	private static Map<Integer,Product> products = new HashMap<Integer,Product>();

	@Override
	public boolean addProduct(Product p) {
		if (products.get(p.getProductId()) != null)
			return false;
		products.put(p.getProductId(), p);
		return true;
	}

	@Override
	public boolean deleteProduct(int id) {
		if(products.get(id) == null) return false;
		products.remove(id);
		return true;
	}

	@Override
	public Product searchProduct(int id) {
		return products.get(id);
	}

	/*@Override
	public List<Product> getAllProducts() {
		Set<Integer> ids = products.keySet();
		List<Product> p = new ArrayList<Product>(ids.size());
		for(Integer id : ids){
			Product product = products.get(id);
			p.add(product);
		}
		return p;
	}
*/
}
