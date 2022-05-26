package POM_ClassHRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignleave 
{
	WebDriverWait wait;

    @FindBy(xpath="//a[@id='menu_dashboard_index']")
    private WebElement dashboard;
    
    @FindBy(xpath="(//div[@class='quickLaunge'])[1]")
    private WebElement Assignleave;
    
    @FindBy(xpath="//input[@name='assignleave[txtEmployee][empName]']")
    private WebElement Employees;
    
    @FindBy(xpath="//select[@name='assignleave[txtLeaveType]']")
    private WebElement LeaveType;
    
    @FindBy (xpath="//input[@id='assignleave_txtFromDate']")
    private WebElement fromdate;
    
    @FindBy (xpath="//input[@id='assignleave_txtToDate']")
    private WebElement Todate;
    
    @FindBy(xpath="//input[@id='assignBtn']")
    private WebElement Assign;
    
    public Assignleave(WebDriver driver) 
    {
    	wait =new WebDriverWait(driver,10);
    	PageFactory.initElements(driver,this);
    	
    }
    
    public void dashboard1() 
    { 
    	dashboard.click();
    	
    }
    public void Assignleave1() 
    {
    	boolean s=Assignleave.isDisplayed();
	   System.out.println(s);
    	
    	Assignleave.click();
    	 
    
    }
    public void Employees1() 
    {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='assignleave[txtEmployee][empName]']")));
    	Employees.sendKeys("Prajakta Dhumal");
    }
    public void LeaveType1() 
    {   
    	Select a=new Select(LeaveType);
    	a.selectByVisibleText("CAN - Bereavement");
    }
    public void fromdate1() 
    {
    	fromdate.click();
    	fromdate.sendKeys("2022-01-06");
    }
  
    public void Assing1()  
    {
  
    	Assign.click();
    }
}
