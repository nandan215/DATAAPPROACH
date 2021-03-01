package Databasetesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePractice {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//Class.forName("");
	Connection con=	DriverManager.getConnection("jdbc:mysql:///ramu", "root", "imbusy4ever");
	
	Statement st=con.createStatement();
	String query="select*from shayam";
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			System.out.println(" "+rs.getString(1)+" "+rs.getInt(2));
		}

	}

}
