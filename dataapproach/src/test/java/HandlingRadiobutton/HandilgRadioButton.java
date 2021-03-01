package HandlingRadiobutton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandilgRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
	List<WebElement> radios=driver.findElements(By.xpath("//input[@name='lang' and @type='radio'] "));
	
	System.out.println(radios.size());
	for(WebElement eachradio:radios)
	{
		String text=eachradio.getAttribute("value");
		System.out.println("the text value is:"+" "+text);

		if(text.equalsIgnoreCase("Python"))
		{
			eachradio.click();
			
			System.out.println("text");
		}
		
		else
		{
			System.out.println("element is not present");

			
		}
	}
driver.close();
	}
	


	}


