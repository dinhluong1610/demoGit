package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	public static Connection con;
	
	public DAO(){
		if(con == null){
			String dbUrl = "jdbc:mysql://localhost:3306/qlkhachsan";
			String dbClass = "com.mysql.jdbc.Driver";
			try {
				Class.forName(dbClass);
				con = DriverManager.getConnection (dbUrl, "root", "123456789");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
        public static void main(String[] args) {
        DAO dao = new DAO();
        if(con==null) System.out.println("chua ket noi");
        else System.out.println("ket noi roi");
    }
}
