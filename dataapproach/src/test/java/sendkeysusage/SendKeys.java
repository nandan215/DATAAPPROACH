package sendkeysusage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SendKeys {
	public static void main(String[] args) {
		
	
    WebDriver driver=new ChromeDriver();
  
   WebElement wb=driver.findElement(By.name(""));
 
   
   wb.sendKeys("hello");//typing we can use
    wb.sendKeys(Keys.ARROW_DOWN);
    wb.sendKeys(Keys.ENTER);
    wb.sendKeys(Keys.SHIFT,Keys.ENTER);
    wb.sendKeys(Keys.ADD,Keys.SHIFT,Keys.ARROW_DOWN);
    //to open link on separate tab
String clickonlink=    Keys.chord(Keys.CONTROL,Keys.ENTER);
wb.sendKeys(clickonlink);

//to clear the text box
wb.clear();
}
}