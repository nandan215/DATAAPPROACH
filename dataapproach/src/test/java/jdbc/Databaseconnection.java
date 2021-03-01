package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Databaseconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//to use data base connection first of all we need driver software for the corresponding databasevendor
		//in this mysql is my database
		//driver software need to be donload from mysql official website or from maven repository get the depedency 
		//depedency name is mySql connector jar
		//it contains the implementation class of jdbcApi
		//after download the jar configure it to javabuildpath 
		//Class.forName("com.mysql.jdbc.Driver");
		//Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. 
		//The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
		Class.forName("com.mysql.cj.jdbc.Driver");
		//load and register the driver softwares
		//Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/datbasename", "root", "imbusy4ever");
		Connection con=	DriverManager.getConnection("jdbc:mysql:///country", "root", "imbusy4ever");
		//Drivermanager is a class present in java.sqlpackage
		//getconnection is a staticmethod present in a DriverMAnger class 
		//since it is staticmethod we can directly call this method without creating the object the class but with claas name
		//this method return Connection object
		Statement stmnt=con.createStatement();
		//Connection is one type of interface present in java.sql package
		//this con reference object is connection type
		//this con reference has acces to Connection interface method
		//we call createStatement method in this con reference
		//this method return Statement type
		ResultSet rs=stmnt.executeQuery("select* from citizen;");
		//String j=rs.getString(1);
		//System.out.println(j);
		//Staement is a interface present in java.sql pacakage
		//Stmnt is reference object 
		//this sataement refence has execute query method
		//this method returns ResultSEt;
		
		
		while(rs.next())
		{
			System.out.println(rs.getString(3)+" "+rs.getString(1)+" "+rs.getString(1));
			
		}
		//ResultSet is an Interface present in a java.sql pacakage
		//from result set we can retrive the data
		//by using while loop
		/*for (int i=0;i<4;i++)
		{
			System.out.println(rs.getString(3)+" "+rs.getString(1)+" "+rs.getString(1));

		}*/
		stmnt.close();
		con.close();
		
	

	}

}
