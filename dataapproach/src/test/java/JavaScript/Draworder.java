
package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Draworder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://silvershipmart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String script1="document.getElementById('search').value='nandan';";
		js.executeScript(script1);
	
		 WebElement drawborder=driver.findElement(By.id("search"));
		   // String script10="arguments[0].style.border='thin dotted red';";
		    String script10="arguments[0].style.border='3PX solid red';";
		    js.executeScript(script10, drawborder);
		    
		    String script11="return document.title;";
			 String title= (String) js.executeScript(script11);
			 System.out.println(title);
			 
			// String script7="alert('Welcome to selenium')";
			   // js.executeScript(script7);
		         
			    
			   // String script12="history.go(0)";
				// js.executeScript(script12);
				// System.out.println("pagerefreshdone");
				
				 //String script13="window.scrollTo(0,document.body.scrollHeight)";
				 //System.out.println(script13);

				 
				//js.executeScript(script13);
				
				// String script14="window.scrollBy(0,1000)";
				// js.executeScript(script14);//this will scroll down the page by 1000 pixel vertical
				 
				 //to scroll down the webpage by the visibility of the element using scrollIntoView() method of java script
				 WebElement view=driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[4]/div/div/div/div[1]/figure/div/img"));
				 	 String script15="arguments[0].scrollIntoView();";
				 	 js.executeScript(script15,view );
	    	

	}

}
