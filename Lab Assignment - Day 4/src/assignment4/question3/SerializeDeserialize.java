package assignment4.question3;
// For File Handling
import java.io.File;
// For Serialization
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
// For De-serialization
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class SerializeDeserialize {

	public static void main(String[] args) {
	//Serialization 
		Address address = new Address("404", "Not Found", "MyPC", "Internet", 127001);
		Employee employee = new Employee("Vinayak Kuradia", "101", address, 80000);
		
		
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("employee.ser")));
			objectOutputStream.writeObject(employee);
			objectOutputStream.close();
		} catch (Exception e) {
			System.out.println("Exception occurred, "+e.getMessage());
		}
		
		System.out.println("Serialization is completed.\nState of object: ");
		employee.display();
		System.out.println();
		
		
	//De-serialization
		try {
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employee.ser"));
		Employee employeeDeserializaed = (Employee) objectInputStream.readObject();
		objectInputStream.close();
		System.out.println("Deserialization is completed.\nState of object: ");
		employeeDeserializaed.display();
		System.out.println();
		} catch (Exception e) {
			System.out.println("Exception occurred, "+e.getMessage());
		}
	}

}
