/**
 * 
 */
package builder;

/**
 * @author sujeetk1
 *
 */
public class ShopBuilderMain {

	public static void main(String[] args) {

		Phone phone = new PhoneBuilder().setBattery(3100).setOs("android").setRam(2).getPhone();
		System.out.println(phone);
	}

}
