package DataDriventesting;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	public static String [][] Logindata;

	public static WebDriver driver;
  @Test(priority=1)
  public void LaunchBrowser()
  {
	  System.out.println("launch the browser");
	//  System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
	 // driver =new ChromeDriver();
	  
	  
  }
  @Test(priority=2)
  public void navigatetogmailpage() 
  {
	  System.out.println("navigate to gmail page");
	 // driver.navigate().to("https://www.gmail.com");
  }
  public static void VerificationMethod()
  {
	  

  }
  
  @Test(priority=3,dataProvider="getData")
  public void EnterIdandPassword(String username,String Password)
  {
	  System.out.println(username);
	  //driver.findElement(By.xpath("")).sendKeys(username);
	  //driver.findElement(By.xpath("")).sendKeys(Password);
	 // VerificationMethod();
	  System.out.println(Password);
	  
  }

@DataProvider()
  public String[] []getData() throws InvalidFormatException, IOException {

	 File f= new File("C://Users//Nandan//Desktop//LoginTestData.xlsx");
	  XSSFWorkbook wb= new XSSFWorkbook(f);
	 XSSFSheet sheet= wb.getSheet("LoginData");
	 int rowcount=sheet.getLastRowNum();
	 int colcount=sheet.getRow(0).getLastCellNum();
      Logindata=new String[rowcount+1][colcount];
	 //System.out.println(rowcount);
	// System.out.println(colcount);
	 
	 for (int i=0;i<=rowcount;i++)
	 {
		 if(!(i==0)) { 
		for (int j=0;j<colcount;j++)
		{
			
	CellType cell =sheet.getRow(i).getCell(j).getCellType();
	
			if(cell==CellType.STRING)
			{
			String	Stringcellvalue=sheet.getRow(i).getCell(j).getStringCellValue();
			Logindata[i][j]=Stringcellvalue;
			
			
			}
			else
			{
			double	Numericcellvalue=sheet.getRow(i).getCell(j).getNumericCellValue();
			String text=NumberToTextConverter.toText(Numericcellvalue);
			//System.out.print(text);
			Logindata[i][j]=text;
		
	}	
			}
			}

}
	 return Logindata;
	  
	  
	
	 
	  
	  
  }
 
  
  
}
