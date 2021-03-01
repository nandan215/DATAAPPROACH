package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    WebDriver driver=new ChromeDriver();
	  
	   WebElement wb=driver.findElement(By.name(""));
	   //Select class is present in org.openqa.selenium.support.ui its implement Iselect interface and wrapElement
	   
	   Select s =new Select(wb);
	   s.selectByIndex(0);
	   s.selectByValue("2");
	   s.selectByVisibleText("5Adult");
	 //

	}

}
