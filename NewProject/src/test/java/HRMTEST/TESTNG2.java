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
import org.testng.asserts.SoftAssert;

import Browser.Pojo;
import POM_ClassHRMProject.ApplyLeave;
import POM_ClassHRMProject.Assignleave;
import POM_ClassHRMProject.Leavelist1;
import POM_ClassHRMProject.Login;
import POM_ClassHRMProject.Myleave;
import UtilityClass.BaseClass;




public class TESTNG2 extends Pojo
{
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass1() 
	{
		 driver=LaunchBrowser();
	}
	@Test(priority=1)
	 public void Loginpage() throws EncryptedDocumentException, IOException 
	   {    Login login=new Login(driver);
	  	   login.insertuser(BaseClass.excelsheet(1, 0));
	  	   login.insertpassword(BaseClass.excelsheet(1, 1));
	  	  
	  	   login.loginbutton();
	  	   SoftAssert soft=new SoftAssert();
	  	   String Actual=driver.getCurrentUrl();
	  	   String Expected="https://opensource-demo.orangehrmlive.com/index.php";
	  	   soft.assertEquals(Actual,Expected);
//	  	   soft.assertAll();
	  	   System.out.println("sachin");
	  	 soft.assertAll();
	  	  
	   }
	
	      
	@Test(priority=2)
	public void Myleave2() throws IOException 
	   {
		Leavelist1 leave=new Leavelist1(driver); 
		leave.mylive1();
		leave.fromdate1();
		leave.Todate1();
		leave.Leavestatus1();
		leave.Employee1();
		leave.Subunit1();
		leave.Pastemp();
		leave.searchbutton1();
		BaseClass. screenshot(driver);
			
			
	   }
	
	@Test(priority=3)
	public void Applyleave1() 
	{
		ApplyLeave k=new ApplyLeave(driver);
		
		
		k.clickapplyleave();
		boolean l=driver.findElement(By.xpath("//h1[text()='Apply Leave']")).isDisplayed();
		Assert.assertTrue(l);
		k.leavetypeenter();
		k.enterdate();
		k.enterduration();
		k.applybutton();
	}
	
	@Test(priority=4)
	public void myleave() 
	{
		Myleave d=new Myleave(driver);
		d.clickmyleave();
		d.selectfromdate();
		d.selecttodate();
		d.clickselect();
		d.clicksearch();
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
