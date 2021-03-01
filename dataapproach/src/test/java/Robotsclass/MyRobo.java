package Robotsclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MyRobo {
	public static void main(String[] args) throws AWTException
	{
	
		
		WebDriver driver =new ChromeDriver();
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		
		
	}

}
