package jdbcproject;
import java.sql.*;
import javax.sql.*;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		
		String URL ="jdbc:mysql://localhost:3306/tnsifjava";
		String USER ="BhukyaAnusha";
		String PASSWORD ="anushA@1315";
		//step-1;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("The Driver is Loaded Successfully!!");
		
		//step-2;
		Connection con =DriverManager.getConnection(URL, USER, PASSWORD);
		System.out.println("Connection Established!!");
		
		//step-3;
		Statement st =con.createStatement();
		
		//STEP-4
		st.executeUpdate("CREATE TABLE student(SID int, sname varchar(20))");
		System.out.println("Created Table Successfully!!");
		
		st.close();
		con.close();
		
	}

}
