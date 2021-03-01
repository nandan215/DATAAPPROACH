package handlingHTTPCertification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingHttpcertiication {
	//Q1)why we need desired capabilities class?
	//ans)its needeed because every testing scenario should be executed on some specific testing environment
	//its tell the webdriver which environment we are going to use in our test script

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setproperty method used to set the path where driver is located
		System.setProperty("","");
		
		//desiredcapabilities is a class present in org.openqa.seleinium.remote
		//it contains static method chrome,firefox,safari,internetexplorer
		//its alsp contains setcapability() method
		//its accept two arguments 1st)capability type and 2nd) boolean
		//capabilitytype is an interface it contains a interface variable like accept insurance certs which is static and final
	

		DesiredCapabilities ch=DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//setcapability take the various capability as input variable which are then used by web
		//driver to launch the application
	
		
		
	//chromeoptions is a class present in org.openqa.selenium.chrome
		//its contain merge() method this method merges different capabilities
		ChromeOptions c=new ChromeOptions();
		
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);
		ch.acceptInsecureCerts();

		
	}

}
