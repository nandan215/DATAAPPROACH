package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotclass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TakesScreenshot scr;
		System.setProperty("webdriver.chrome.driver", "C:work//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//scr=(TakesScreenshot)driver;
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		String title=driver.getTitle();
		if(title=="ram")
		{
			
			
		}
		else
		{
			System.out.println("verifaction failed"+":"+title);
			

			
			TakesScreenshot ts=(TakesScreenshot) driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			
			File target=new File(System.getProperty("user.dir") + "/ScreenShot/" +"lovelypic"+ ".png");
			
			FileUtils.copyFile(source, target);
			System.out.println("ScreenShottaken");
			
		}

	}

}
