package POM_ClassHRMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	 @FindBy(xpath="//input[@name='txtUsername']")
     private WebElement usename;
   @FindBy (xpath="//input[@name='txtPassword']")
   private WebElement password;
   @FindBy (xpath="//input[@name='Submit']")
   private WebElement login;
   
   
   public Login(WebDriver driver) 
   {
   	PageFactory.initElements(driver,this);
   } 
   
   public void insertuser(String h) 
   {
   	usename.sendKeys(h);
   	
   }
   
   public void insertpassword(String h) 
   {
   	password.sendKeys(h);
   }
   public void loginbutton()  
   
   {
	   
   	login.click();;
   }
}
