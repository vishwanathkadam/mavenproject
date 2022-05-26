package UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BaseClass 
{static int i=1;
   
   public  static void screenshot(WebDriver driver) throws IOException 
   {
	  File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File dest=new File("D:\\Testing\\Screenshoot\\kadam"+i+".jpg");
	  FileHandler.copy(source, dest);
	  i++;
   }
   public static String  excelsheet(int row,int cell) throws EncryptedDocumentException, IOException 
   {
	   
   
   String path="C:\\Users\\user1\\Desktop\\kadam.xlsx";
	FileInputStream file=new FileInputStream(path);
	Sheet s=WorkbookFactory.create(file).getSheet("kadam1");
	String h=s.getRow(row).getCell(cell).getStringCellValue();
	System.out.print(h);
		return h;
		
		
		
		
	}
	
   }
	
	
	
	
	
	
	
	
	
	

