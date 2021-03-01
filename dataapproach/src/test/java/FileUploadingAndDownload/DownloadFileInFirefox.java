package FileUploadingAndDownload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFileInFirefox {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:work//geckodriver.exe");
		Robot rb=new Robot();
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk", "text/plain");
		profile.setPreference("browser.download.manager.showWhenStarting",false);
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		WebDriver driver=new FirefoxDriver(option);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
        driver.findElement(By.id("textbox")).sendKeys("i am nandan the great");
        driver.findElement(By.id("createTxt")).click();
        
        Thread.sleep(3000);
        rb.keyPress(KeyEvent.VK_DOWN);
        
       /* rb.keyPress(KeyEvent.VK_TAB);
        rb.keyPress(KeyEvent.VK_TAB);
        rb.keyPress(KeyEvent.VK_TAB);
        rb.keyPress(KeyEvent.VK_ENTER);*/
        
       // Thread.sleep(3000);
        //driver.findElement(By.id("createTxt")).click();
       // driver.findElement(By.id("link-to-download")).click();

	}

}
