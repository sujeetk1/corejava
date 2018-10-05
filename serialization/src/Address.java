
import java.io.Serializable;

public class Address implements Serializable{
	
	private static final long serialVersionUID = 7191782010100958352L;
	
	private String city;
	private String street;
	private long pincode;
	
	public Address(String city, String street, long pincode) {
		super();
		this.city = city;
		this.street = street;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", pincode=" + pincode + "]";
	}
	
	
	
}
