package JavaScript;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Q1)why we need javascriptexecutor executor?
//ans)java script executor can extract the hidden elements
//because selenium cannot identify hidden element (ajax implementation)
//some time the webelement object may be in diasbled mode in that case
//selenium cannot find the element in disabled mode in that case javascriptexecutor can interact
//even if the type box is in diabled mode javascript has the power to type the text in disabled mode also
//forcefully javascript can change the value within the dom
//if you want to forcefully inject some vaues for negative testing or something else you can take the help of java script executor

//Q2)why we shouldnot use the javascript extensively in our automation testing?
//Ans)so lets considerd a scenario that we hava dedicated textbox due to some reason it is disabled
//it may be due to application issue or some other issue
//if you use sendkeys method it will going to fail.
//and you can report to the development team
//but if u use javascriptexecutor even though it isdisabled .it is going to inject the vaue forcefully
//which is not correct
//we will have to test the application how normal user will use the applictaion so that we can find the bugs
//unneceesary dont use javascript exrcutor

public class javascript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		//downcasting of Webdriver driver to javaScriptExecutor is done here
		//to use javaSCriptExecutor method
		//advanatage is that we dont have to create another object  plus 
		//javaScriptexecutor is an interface we cannot create direct object of it
	JavascriptExecutor	js=(JavascriptExecutor)driver;
	//this javascript executor has two methos
	//1) object executeScript(String Script,Object args..)//when to use this method
	//2)object executeAsyncScript(String Script,Object args..)//nwhen to use this method
   
	//To get the text this code will get text of the box from web page
	String Script="return document.getElementById(\"fromplacename\").value;";
    String text=(String) js.executeScript(Script);
    System.out.println(text);
	
    //to type text in selenium webdriver without using sendkeys
    //1st way
    WebElement email=driver.findElement(By.name(""));
    String Script1="arguments[0].value='nandan215@gmail.com'";
    js.executeScript(Script1,email);
    String Script2="arguments[0].value=arguments[1]";
    js.executeScript(Script2, email,"nandan215@gmail.com");
    //2ndway
    String script3="document.getElementById('some id').value='mukesh'";
    js.executeScript(script3);
    
    //to click on a button
    //1st way
    String script4="documemt.getElementById('some id').click";
    js.executeScript(script4);
    //2nd way
    WebElement clickaction=driver.findElement(By.name(""));
    String script5="arguments[0].click";
    js.executeScript(script5, clickaction);
    
    //To handle checkbox
    //program how to uncheck checkbox in selenium if checkbox is disabled
    String script6="document.getElementById('some id').checked=false;";
    js.executeScript(script6);
    
    //to generate popup or alertinfo
    
    String script7="alert('Welcome to selenium')";
    js.executeScript(script7);
    
    //falshing an element

	WebElement flash=driver.findElement(By.id("search"));
	    String bgcolor=flash.getCssValue("backgroundcolor");
	  String blackcolor="#000000";
	    for(int i=0;i<500;i++)
	    {
	    	 String Script8="arguments[0].style.background='"+bgcolor+"'";
	    	 String Script9="arguments[0].style.background='"+blackcolor+"'";
	    	 js.executeScript(Script8,flash);
	    	 js.executeScript(Script9, flash);
	    
	    }
    //to draw a border around the webElement or we can say to highlight element
	    WebElement drawborder=driver.findElement(By.xpath(""));
	    String script10="arguments[0].style.border='thin dotted red';";
	    js.executeScript(script10, drawborder);
    	
    
	//to capture the the title of the page
	    String script11="return document.title;";
	// String title= (String) js.executeScript(script11);
	 String title=  js.executeScript(script11).toString();
	 System.out.println(title);
	 
	 //to refresh an browser
	 String script12="history.go(0)";
	 js.executeScript(script12);
	                 //Scrolling metghods in javascript
	 //to scroll down bottom of the page by using window.scrollTo() method its accept to argument  
	 //document.body.scrollHeight returs the height of the webpage
	 String script13="window.scrollTo(0,document.body.scrollHeight";
	 js.executeScript(script13);
	 
	 //to scroll down the web page by pixels using scrollBy() method
	 String script14="window.scrollBy(0,1000)";
	 js.executeScript(script14);//this will scroll down the page by 1000 pixel vertical
         
	 
	 //to scroll down the webpage by the visibility of the element using scrollIntoView() method of java script
WebElement view=driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[4]/div/div/div/div[1]/figure/div/img"));
	 String script15="arguments[0].scrollIntoView();";
	 js.executeScript(script15,view );
	 
	 
	}

}
