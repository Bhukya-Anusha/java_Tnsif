package jdbcproject.services;

import java.sql.*;
import javax.sql.*;
import jdbcproject.dao.DBUtil;

public class CrudOperations {
	static Connection con;
	static PreparedStatement pst;
	static {
		con = DBUtil.getConnection();
		if(con!=null) {
			System.out.println("Conneciton is success!!");
		}
	}
	
	public static int addstudent(int sid ,String sname) {
		int n=0;
		try {
			pst = con.prepareStatement("INSERT INTO student VALUES(?,?)");
			pst.setInt(1, sid);
			pst.setString(2, sname);
			pst.executeUpdate();
		}catch(Exception e) {
			
		}
		return n;
	}
	
	 public static int updatestudent(int sid, String newName) {
	        int n = 0;
	        try {
	            pst = con.prepareStatement("UPDATE student SET sname = ? WHERE sid = ?");
	            pst.setString(1, newName);
	            pst.setInt(2, sid);
	            n = pst.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return n;
	    }
	    
	    public static int deletestudent(int sid) {
	        int n = 0;
	        try {
	            pst = con.prepareStatement("DELETE FROM student WHERE sid = ?");
	            pst.setInt(1, sid);
	            n = pst.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return n;
	    }
}
