package POM_ClassHRMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Leavelist1 
{
	@FindBy(xpath="(//div[@class='quickLaunge'])[2]")
	  private WebElement mylive;
	  
	  @FindBy(xpath=" //input[@name='leaveList[calFromDate]']")
	  private WebElement fromdate;
	  
	  @FindBy(xpath="//input[@name='leaveList[calToDate]']")
	  private WebElement Todate;
	  
	  @FindBy(xpath="//input[@id='leaveList_chkSearchFilter_2']")
	  private WebElement  Leavestatus;
	  
	  @FindBy(xpath="//input[@id='leaveList_txtEmployee_empName']")
	  private WebElement  Employee;
		
	  @FindBy(xpath="//select[@id='leaveList_cmbSubunit']")
	  private WebElement  Subunit; 
	  
	  @FindBy(xpath="//input[@id='leaveList_cmbWithTerminated']")
	  private WebElement  Pastemp; 
	  
	  @FindBy(xpath="//input[@id='btnSearch']")
	  private WebElement  searchbutton;
	  
	  
	  public Leavelist1(WebDriver driver) 
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  public void mylive1() 
	  {
		  mylive.click(); 
	  }
	  public void fromdate1() 
	  
	  {
		  
		  fromdate.sendKeys("2020-07-12");  
	  }
	  public void Todate1() 
	  {
		  
		  Todate.sendKeys("2020-08-12");
	  }
	  public void Leavestatus1() 
	  {
		  Leavestatus.click();
	  }
	  public void Employee1() 
	  {
		  Employee.sendKeys("Nina Patel");
	  }
	  public void Subunit1() 
	  {
		  Select s=new Select(Subunit);
		  s.selectByVisibleText("Human Resources");
	  }
	  public void Pastemp() 
	  {
		  Pastemp.click();
	  }
	  public void searchbutton1() 
	  {
		  searchbutton.click();
	  }
}
