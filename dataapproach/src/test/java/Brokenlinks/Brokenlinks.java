package Brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import okhttp3.HttpUrl;

public class Brokenlinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("http://demo.guru99.com/V4/");
	    Thread.sleep(2000);
	    
	    List<WebElement> x=driver.findElements(By.tagName("a"));
	   int z= x.size();
	    for (int i=0;i<z;i++)
	    {
	    	//by using href attribute we can get url of required link
	    WebElement element=x.get(i);
	    String url=element.getAttribute("href");
	    URL link= new URL(url);
	    //create a connection using url object link
	    HttpURLConnection	 httpconn= (HttpURLConnection)link.openConnection();
	    
	    httpconn.connect();
	  int rescode=   httpconn.getResponseCode();//if rescode is avove 400 then it is broken link
	  if(rescode>=400)
	  {
		  System.out.println(url+" "+"is broken link");
	  }
	  else
	  {
		  System.out.println(url+" "+"is valid link");

		  
	  }
	    
	    	
	    }
	  

	}

}
