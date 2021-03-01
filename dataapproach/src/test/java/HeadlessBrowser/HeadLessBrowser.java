package HeadlessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
         options.setHeadless(true);
         WebDriver driver=new ChromeDriver(options);
         
         //after this steps your driver has got the ability to run headless;
         FirefoxOptions fopn=new FirefoxOptions();
         fopn.setHeadless(true);
         WebDriver fdriver=new FirefoxDriver();
         
         //Safari class threr is no headless method in it
         SafariOptions sop=new SafariOptions();
        
         WebDriver sdriver=new SafariDriver();
         
         
         
         //Html unit Driver
         HtmlUnitDriver hdriver=new HtmlUnitDriver();
         
         hdriver.get("");
         //phantomjs is also used for headlessbrowser
         
         
         
         
	}

}
