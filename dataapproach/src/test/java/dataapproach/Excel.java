package dataapproach;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("E://SeleniumPractice//ram.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(fis);
		
	         XSSFSheet    Sheet =w.getSheet("automationtest");
	        int countrow= Sheet.getLastRowNum();
    		System.out.println(countrow);

	     int colcount=   Sheet.getRow(0).getLastCellNum();
 		System.out.println(colcount);

	        
	       
	      
	    ArrayList l= new ArrayList();
	         for(int row =0;row<countrow;row++)
	         {
	        	XSSFRow Currentrow=Sheet.getRow(row);
	        	for(int col=0;col<colcount;col++)
	        	{
	        		String value=Currentrow.getCell(col).getStringCellValue();
	        		l.add(value);
	        		System.out.print("  "+value);
	        	}
	        	System.out.println(" ");
	        
	        	
	        	
	         }
	        System.out.println(l);
        	
	         

	}

}
