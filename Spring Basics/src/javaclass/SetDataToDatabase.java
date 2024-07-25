package javaclass;

import java.util.Scanner;
import java.sql.*;
public class SetDataToDatabase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the customer id");
        String CUST_ID = sc.next();

        System.out.println("Enter the customer Name");
        String CUST_NAME = sc.next();

        System.out.println("Enter the Product Name");
        String product = sc.next();

        System.out.println("Enter the Product Id");
        String product_id = sc.next();

//        System.out.println("Enter the Mobile Number");
//        long mobile = sc.nextLong(); // Changed to nextLong()

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
                 PreparedStatement ps = con.prepareStatement("INSERT INTO CUSTOMER VALUES (?, ?, ?, ?)") ;

                ps.setString(1, CUST_ID);
                ps.setString(2, CUST_NAME);
                ps.setString(3, product);
                ps.setString(4, product_id);

                int res = ps.executeUpdate();

                if (res > 0) {
                    System.out.println("Success");
                }
            
        } catch (Exception obj) {
            obj.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
