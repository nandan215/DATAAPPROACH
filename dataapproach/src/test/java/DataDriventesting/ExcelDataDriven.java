package DataDriventesting;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDriven {
	
    public static String [][] Logindata;
	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		
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
    System.out.println(" ");
	}
		 for(String[] s:Logindata)
		 {
			 for(String s1:s)
			 {
				 System.out.println(s1+" ");
			 }
			 
			 
		 }
		 
	

}
}
