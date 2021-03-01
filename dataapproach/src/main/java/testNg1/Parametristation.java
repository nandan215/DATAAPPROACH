package testNg1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametristation {

	@Parameters({"url","Password"})
	@Test
	public void para(String url ,String Password)
	{
		System.out.println(url);
		System.out.println(Password);
		
		
	}

}
