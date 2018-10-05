import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDeserialize {

	public static void main(String[] args) {
		Address address = new Address("new delhi", "cp", 600089);
		Employee employee = new Employee("john", 1, address);
		String filepath = "D://temp.txt";
		serialize(filepath, employee);
		deserialize(filepath);
	}

	private static void deserialize(String filepath) {
		try(ObjectInputStream is = new ObjectInputStream(new FileInputStream(new File(filepath)))){
			Employee employee = (Employee)is.readObject();
			System.out.println(employee);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private static void serialize(String filepath, Employee employee) {
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filepath))){
			os.writeObject(employee);		
		}catch(Exception e){
			e.printStackTrace();
		}

		
	}

}
