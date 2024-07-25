package javaclass;
import java.sql.*;

public class RetrieveDataFromTable {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select * from customer");
			
			while(rs.next()) {
				
				String cust_id = rs.getString("CID");
				String cust_name = rs.getString("CNAME");
				String location = rs.getString("LOC");
				String emailid = rs.getString("MOBILE");
				
				System.out.println("Customer ID : " + cust_id);
				System.out.println("Customer Name : " + cust_name);
				System.out.println("Location : " + location);
				System.out.println("Email ID : " + emailid);
				
				System.out.println("");
			}
			
		} catch (Exception obj) {
			
			obj.printStackTrace();
		}
	}
}