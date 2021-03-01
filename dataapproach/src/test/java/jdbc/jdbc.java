package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
	//DriverManager is a class in java.sql package and getconnection is static method present in it;
	//its return type is connection 

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		/*public static Connection getConnection(String url,String user,String password) throws SQLException
Attempts to establish a connection to the given database URL. 
The DriverManager attempts to select an appropriate driver from the set of registered JDBC drivers.
Parameters:
url - a database url of the form jdbc:subprotocol:subname
user - the database user on whose behalf the connection is being made
password - the user's password
Returns:
a connection to the URL
Throws:
SQLException - if a database access error occurs*/
		Class.forName("com.mysql.jdbcDriver");//present in java.lang package its a class  & forname is satic method
		//static Class<?>	forName(String className)
		//Returns the Class object associated with the class or interface with the given string name.
		
		String url="jdbc:mysql:";
		String username="root";
		String password="imbusy4ever";
		
		
	Connection con=DriverManager.getConnection("", username, password);
	//Creates a Statement object for sending SQL statements to the database. 
	//SQL statements without parameters are normally executed using Statement objects. 
	//If the same SQL statement is executed many times, it may be more efficient to use a PreparedStatement object.
	Statement stmnt=con.createStatement();
	//now statement is a interface
	//here crate statment is a method present in connection interface
	//this createstatement method return statement object
	String SQLQuery="select*from Employee;";
	//executequery is amethod present in a Ststement interface
	//this method return type is Result set
	ResultSet result=stmnt.executeQuery(SQLQuery);
while(result.next())
{
	result.getString(2);
}
stmnt.close();
con.close();
	
	
	

	}

}
