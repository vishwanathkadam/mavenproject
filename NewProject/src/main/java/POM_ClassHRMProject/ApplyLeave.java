package POM_ClassHRMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ApplyLeave 
{
   @FindBy (xpath="//select[@id='applyleave_txtLeaveType']")
   private WebElement Leavetype;
   
   @FindBy (xpath="(//div[@class='quickLaunge'])[4]")
   private WebElement applyclick;
   
   @FindBy (xpath="//input[@id='applyleave_txtFromDate']")
   private WebElement fromdate;
   
   @FindBy (xpath="//select[@id='applyleave_duration_duration']")
   private WebElement duration;
   
   @FindBy (xpath="//input[@id='applyBtn']")
   private WebElement apply;
   
   
   public ApplyLeave(WebDriver Driver) 
   {
	   PageFactory.initElements(Driver, this);
   }
   
   public void clickapplyleave() 
   {
	   applyclick.click();
   }
   
   public void leavetypeenter() 
   {
	   Select a=new Select(Leavetype);
	   a.selectByVisibleText("CAN - Personal");
   }
   
   public void enterdate() 
   {
	   fromdate.click();
	   fromdate.sendKeys("2022-06-04");
   }
   
   public void enterduration() 
   {
	   Select b=new Select(duration);
	   b.selectByVisibleText("Full Day");
   }
   public void applybutton() 
   {
	   apply.click(); 
   }
   
}
