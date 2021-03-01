package Sikuli;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class fileUpload {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
	
		ChromeOptions c=new ChromeOptions();
		ChromeOptions xfactor=c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver=new ChromeDriver(xfactor);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("imagesrc")).click();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		
	
		//WebElement x=driver.findElement(By.xpath("//*[@id='imagesrc']"));
		////js.executeScript("argument[0].click();",x);
		String AppleimageFilepath="C://Users//Nandan//Desktop//offer letter";
		String snippetfilepath="E://Sikuli";
		Screen s=new Screen();
		Pattern fileinputTextbox=new Pattern("E://Sikuli//Filelocation.PNG");
		Pattern openbutton=new Pattern("E://Sikuli//openbutton.PNG");
		
		
	
		Thread.sleep(5000);

		s.wait(fileinputTextbox, 20);
		s.type(fileinputTextbox,"C://Users//Nandan//Desktop//nandan sdet resume and documents//Nandan Gupta_Resume.docx");
		s.click(openbutton);
		driver.close();
		

		
		

	}
}
