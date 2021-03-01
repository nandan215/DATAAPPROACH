package dataapproach;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practicedataexcel {
	public static FileInputStream fis;
	public static void main(String [] args) throws IOException {
	File f= new File("C://Users//Nandan//Desktop//testngtestframework.xlsx");
	
	try {
	       fis=new FileInputStream(f);
		
	}
	catch (Exception e)
	{
		System.out.println("Exception is"+ e.getMessage());
		
	}
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet=wb.getSheetAt(0);
	int sizeofrow=sheet.getPhysicalNumberOfRows();
	System.out.println("ror"+sizeofrow);
	int sizeofcol=sheet.getRow(0).getPhysicalNumberOfCells();
	System.out.println("col"+sizeofcol);
	
	for(int i=0;i<sizeofrow;i++)
	{
		for (int j=0;j<sizeofcol;j++)
		{
			String data=sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(" "+data+" ");
		}
		System.out.println(" ");

	}
	
	
	

}
}
