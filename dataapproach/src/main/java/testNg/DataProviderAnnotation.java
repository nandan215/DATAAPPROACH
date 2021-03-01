package testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	//suppose if we want to test a single test case 20 time and each time with different data then
	//how you will do it
	
	@Test(dataProvider="getData")
	public void gmail(String username,String Password)
	{
		System.out.println(username);
		System.out.println(Password);

		
	}
	@DataProvider
	public String[][] getData()
	{
		String[][] data=new String[3][2];
		data[0][0]="first name";
		data[0][1]="first password";
		data[1][0]="second name";
		data[1][1]="second password";
		data[2][0]="first name";
		data[2][1]="first password";
		return data;
		
		
	}

}
