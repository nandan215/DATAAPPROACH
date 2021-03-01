package FileUploadingAndDownload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ByUsingSendKeyMethod {

		 public static void main(String[] args) throws InterruptedException {
		  
		  WebDriver driver;
		  System.setProperty("webdriver.chrome.driver",
		    "C:\\work\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		  Thread.sleep(2000);
		  Actions act= new Actions(driver); 
		  WebElement chooseFile=driver.findElement(By.id("fileupload1"));
		  act.moveToElement(chooseFile).perform(); 
		  Thread.sleep(1000); 
		  chooseFile.sendKeys("C://Users//Nandan//Desktop//nandan sdet resume and documents//hi.txt");
		 }
		

	}


