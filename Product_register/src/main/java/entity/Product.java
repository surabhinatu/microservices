package entity;

import java.io.Serializable;
/**
 * Bean to get the name,id,type and details of product
 * @author Surabhi_Natu
 *
 */
public class Product implements Serializable{

	private static final long serialVersionUID = -5577579081118070434L;
	
	private String productName;
	private int productId;
	private String productType;
	private String productDetails;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductDetail() {
		return productDetails;
	}
	public void setProductDetail(String productDetail) {
		this.productDetails = productDetail;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString(){
		return productName+"::"+productId+"::"+productId;
	}

}