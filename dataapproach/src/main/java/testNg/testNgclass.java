package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNgclass {
	//public WebDriver driver;
	//WebElement e;
	
	@Test
	public void launchthebrowser()
	{
		System.out.println("i am at 1st position");
		System.out.println("launching of the browser");
		//System.setProperty("", "");
		// driver=new  ChromeDriver();
		
	}
	
	@Test
	public void opentheurl()
	{
		System.out.println("i am at 2nd position");

		//driver.get("");
	}
	@Test
	public void typeontextbox()
	{
		System.out.println("i am at3rd position");
      //  e=driver.findElement(By.id(""));
       // e.sendKeys("nandan");
	}
	
	@Test(dependsOnMethods= {"launchthebrowser"})
	public void clickonelement()
	{
		System.out.println("i am at 4th position");

		
	}
	@Test
	public void mobileTest()
	{
		System.out.println("i am at5th position");

	}
	
	
	@BeforeSuite
	public void close()
	{
		System.out.println("i am at last position");
		System.out.println("closing of the browser");
		//driver.close();
	}

}
