package FileUploadingAndDownload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileInChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:work//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/FileDownload.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("textbox")).sendKeys("i am nandan the great");
        Thread.sleep(3000);
        driver.findElement(By.id("createTxt")).click();
        driver.findElement(By.id("link-to-download")).click();
        
        
	}

}
