package OpenChildWindow;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChildWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       WebDriver driver=new ChromeDriver();
       driver.get("https://silvershipmart.com/");
       
      int initiallinkcount= driver.findElements(By.tagName("a")).size();
      System.out.println(initiallinkcount);
      
      WebElement footerdriver= driver.findElement(By.id("colophon"));
      
      /* wb.sendKeys("hello");//typing we can use
       wb.sendKeys(Keys.ARROW_DOWN);
       wb.sendKeys(Keys.ENTER);
       wb.sendKeys(Keys.SHIFT,Keys.ENTER);
       wb.sendKeys(Keys.ADD,Keys.SHIFT,Keys.ARROW_DOWN);
  String clickonlink=    Keys.chord(Keys.CONTROL,Keys.ENTER);
  wb.sendKeys(clickonlink);*/
  //limiting the scope of webdriver
    int noflinks=  footerdriver.findElements(By.tagName("a")).size();
  List<WebElement>  Webis=driver.findElements(By.tagName("a"));
    System.out.println(noflinks);
    for(int i=0;i<=0;i++)
    {
    Webis.get(i).sendKeys(Keys.CONTROL,Keys.ENTER);	
    }
 Set<String>  idsofwindow= driver.getWindowHandles();
 Iterator<WebElement> it=Webis.iterator();
 while(it.hasNext())
 {
	 
	 System.out.println(driver.getTitle());
	 
 }
    

      
  
  
       
	}

}