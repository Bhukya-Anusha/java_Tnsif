package jdbcproject.dao;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.*;
import javax.sql.*;

public class DBUtil {

	private static Connection con;
	private static final String Driver ="com.mysql.cj.jdbc.Driver";
	private static final String USERNAME ="BhukyaAnusha";
	private static final String PASSWORD ="anushA@1315";
	private static final String URL="jdbc:mysql://localhost:3306/tnsifjava";
	
	public static Connection getConnection() {
		try {
			Class.forName(Driver);
			System.out.println("Driver loaded Successfully");
			
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Connection Establliched");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
}
