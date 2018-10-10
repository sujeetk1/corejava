package model;

/**
 * 
 * @author sujeetk1
 *
 */
public class Product {

	private String productName;
	private int id;
	private int price;

	public Product(String productName, int id, int price) {
		super();
		this.productName = productName;
		this.id = id;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", id=" + id + ", price=" + price + "]";
	}

}
