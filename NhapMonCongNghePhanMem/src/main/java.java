package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
 
        String url = "jdbc:mysql://localhost:3306/TESTDB";
        String user = "root";
        String password = "Trongduc2206"; 
        try {
        	con = DriverManager.getConnection(url, user, password);
        	System.out.println("Success connect");
        } catch(SQLException e) {
        	e.printStackTrace();
        }finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
 
            }catch(SQLException e) {
            	e.printStackTrace();
            	}
            }
	}

}
