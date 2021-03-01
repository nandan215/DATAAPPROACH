package testNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class apiclass {
	@Parameters({"Url"})
	@Test(groups= {"smoke"})
	public void api1sttest(String url) {
		System.out.println("i am 1st api Test");
		System.out.println(url);


		
	}
	
	@Test
	public void api2ndTest(String url) {
		System.out.println("i am 2nd api Test");

		
	}

}
