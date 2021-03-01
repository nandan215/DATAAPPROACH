package AutoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutiItDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:work//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait w= new WebDriverWait(driver,10);
		//Thread.sleep(3000);
		driver.get("http://tinyupload.com/");
		driver.manage().window().maximize();
		//w.until(ExpectedConditions.elementToBeClickable(element))
		WebElement click=driver.findElement(By.xpath("//input[@name='uploaded_file']"));
		w.until(ExpectedConditions.elementToBeClickable(click));
		click.click();
		Runtime.getRuntime().exec("E://FileuploadScriptforAutoIt.exe");
		

	}

}
