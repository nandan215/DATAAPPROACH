package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class oracle {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//note you have to download oraclejdbc driver/
		Class.forName("oracle.jdbc.oracleDriver");
		Connection con=	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:country", "root", "imbusy4ever");
		Statement stmnt=con.createStatement();
		ResultSet rs=stmnt.executeQuery("select* from citizen;");
		
		while(rs.next())
		{
			System.out.println(rs.getString(3)+" "+rs.getString(1)+" "+rs.getString(1));
			
		}

	}

}
