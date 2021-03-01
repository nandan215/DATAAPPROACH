package HandlingCheckbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
	List<WebElement> checkbox=driver.findElements(By.xpath("//input[@name='lang'and@type='checkbox'] "));
	
	System.out.println(checkbox.size());
	WebElement first=driver.findElement(By.xpath("//input[@name='lang'and@type='checkbox'][1]"));
	String firstcheckbox=first.getAttribute("id");
	System.out.println("FirstCheckBox"+":"+" "+firstcheckbox);
	WebElement second=driver.findElement(By.xpath("//input[@name='lang'and@type='checkbox'][2]"));
	String secondcheckbox=second.getAttribute("id");
	System.out.println("SecondCheckBox"+":"+" "+secondcheckbox);
	
for(WebElement eachcheckbox:checkbox)
	{
		String text=eachcheckbox.getAttribute("id");
		System.out.println("the text value is:"+" "+text);

		if(text.equalsIgnoreCase("code"))
		{
			eachcheckbox.click();
			
			System.out.println(text);
		}
			}
driver.close();
	}
	

}
