package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookiesss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Set<Cookie>cookies=driver.manage().getCookies();
		int sizeofcookie=cookies.size();
		System.out.println(sizeofcookie);

		System.out.println(cookies);
		Cookie c= new Cookie("iam:nanda","gupta");
		driver.manage().addCookie(c);
		int newsizeofcookie=cookies.size();
		System.out.println("newsize"+newsizeofcookie);
		for(Cookie ck:cookies)
		{
			System.out.println(ck.getName()+" "+ck.getValue());
		}
		driver.quit();

		

		
		

	}

}
