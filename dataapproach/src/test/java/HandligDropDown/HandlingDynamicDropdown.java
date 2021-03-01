package HandligDropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		WebElement firstdrpdwn= driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		WebDriverWait w= new WebDriverWait(driver,20);
		w.until(ExpectedConditions.elementToBeClickable(firstdrpdwn));
		firstdrpdwn.click();
		
		////table[@id='citydropdown']  
		//with above xpath two matching nodes are there
		//by index also we can use //table[@id='citydropdown'][1]
		driver.findElement(By.xpath("//table[@id='citydropdown'] //a[@text='Delhi (DEL)']")).click();;
		WebElement secndrpdwn=driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Mumbai (BOM)']"));
		w.until(ExpectedConditions.visibilityOf(secndrpdwn));
		secndrpdwn.click();
		Thread.sleep(3000
				);
		driver.close();
		
		
		
		
		

	}

}
