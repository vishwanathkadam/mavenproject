package HRMTEST;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import Browser.Pojo;
import POM_ClassHRMProject.Assignleave;
import POM_ClassHRMProject.Login;
import POM_ClassHRMProject.My_TimeSheet;
import POM_ClassHRMProject.Timesheet;
import UtilityClass.BaseClass;


public class TESTNG1 extends Pojo

{
	 WebDriver driver;
  
@BeforeClass 
public void beforeclass()        
   {
	  driver=LaunchBrowser();
   } 

   @Test(priority=1)
   public void Loginpage1() throws EncryptedDocumentException, IOException 
   {
  	 Login login=new Login(driver);
  	   login.insertuser(BaseClass.excelsheet(1,0));
  	   
  	   login.insertpassword(BaseClass.excelsheet(1,1));
  	   login.loginbutton();
  	   
  	  boolean k=driver.findElement(By.xpath("(//div[@class='quickLaunge'])[2]")).isDisplayed();
  	  Assert.assertTrue(k);
  	  System.out.println("vishwanath");
  	
   }
   @Test(priority=2)
   public void AssignLeave() throws IOException 
   {
  	 Assignleave leave=new Assignleave(driver);
  	  
  	   leave.Assignleave1();
  	   leave.Employees1();
  	   leave.LeaveType1();
  	   leave.fromdate1();
  	  
  	   leave.Assing1();
  	 BaseClass.screenshot(driver);
  
  	   
 	 boolean p=driver.findElement(By.xpath("//label[@for='assignleave_txtEmployee']")).isDisplayed();
  	   Assert.assertTrue(p);
  	   System.out.println("Kadam");
   }
   @Test(priority=3)
   public void enterdate() 
   {
	   My_TimeSheet p=new My_TimeSheet(driver);
	   p.clickmytimesheet();
	   String Actual=driver.getCurrentUrl();
	   String Expected="https://opensource-demo.orangehrmlive.com/index.php/time/viewMyTimesheet";
	   Assert.assertEquals(Actual, Expected);
	   p.droupdate();
   }
   @Test(priority=4)
   public void timesheet() 
   {
	   Timesheet j=new Timesheet( driver);
	   j.clicktimesheet();
	   j.enteremployee();
	   j.clicksearch();
   }
   @AfterMethod
   public void aftermethod() 
   {
  	 Assignleave leave=new Assignleave(driver);
  	   leave.dashboard1(); 
   }
   @AfterClass
   public void afterclass() 
   {
	   driver.close();
   }
   
	
}
