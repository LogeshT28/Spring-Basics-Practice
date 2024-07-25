package class1;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JAXBParserDemo {
public static void main(String[] arhs) {
	try {
		File f = new File("");
		FileOutputStream fout = new FileOutputStream(f);
		JAXBContext jc = JAXBContext.newInstance(Employee.class);
		Marshaller mc  = jc.createMarshaller();
		Employee emp = new Employee();
		emp.setEmp_id("emp-1");
		emp.setEmp_name("abc");
		emp.setDestination("Production Controller");
		emp.setSalary(400000.00);
		mc.marshal(emp, fout);;
		fout.close(); 
		System.out.println("SUCCESS");
	}
	catch(Exception obj){
		
	}
}
}
  