package HandligDropDown;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandligWithoutSelectclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:work//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait w= new WebDriverWait(driver,10);
		//Thread.sleep(3000);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		//w.until(ExpectedConditions.elementToBeClickable(element))
		WebElement click=driver.findElement(By.xpath("//select[@id='Skills']"));
		w.until(ExpectedConditions.elementToBeClickable(click));
		click.click();
		int size=driver.findElements(By.xpath("//select[@id='Skills']/option")).size();
		System.out.println(size);
	List<WebElement> WebElements=	driver.findElements(By.xpath("//select[@id='Skills']/option"));
	for(WebElement eachWebElement:WebElements)
	{
		String text=eachWebElement.getText();
		if(text.equalsIgnoreCase("java"))
		{
			System.out.println("object is found");
			eachWebElement.click();
		}
		
		//else
		//{
			//System.out.println("object is not found");
	
		//}
			
	}
		
		//driver.quit();
		

	}

}
