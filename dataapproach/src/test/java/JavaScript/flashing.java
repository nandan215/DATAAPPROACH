package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flashing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://silvershipmart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor	js=(JavascriptExecutor)driver;
	//to type a text in search box
		
		String script1="document.getElementById('search').value='nandan';";
		js.executeScript(script1);
		
		
		WebElement flash=driver.findElement(By.id("search"));
		    String bgcolor=flash.getCssValue("backgroundColor");
		    System.out.println("my value");
		System.out.println("hi"+" "+bgcolor);
		System.out.println("this much");
		  String blackcolor="#000000";
		String realcolor=  "rgba(255, 255, 255, 1)";
		    for(int i=0;i<500;i++)
		    {
		    	String Script8="arguments[0].style.backgroundColor='"+realcolor+"'";
		    	 String Script9="arguments[0].style.backgroundColor='"+blackcolor+"'";
		    	 js.executeScript(Script8,flash);
		    	 js.executeScript(Script9, flash);
		    
		    }
		    driver.close();

	}

}
