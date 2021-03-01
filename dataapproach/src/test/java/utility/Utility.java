package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("E://DataDriven//properties//data.properties");
		Properties pro= new Properties();
		pro.load(fis);
		String value=pro.getProperty("driver");
		System.out.println(value);

	}

}
