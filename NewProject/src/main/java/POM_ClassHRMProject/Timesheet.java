package POM_ClassHRMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Timesheet 
{
	@FindBy (xpath="(//div[@class='quickLaunge'])[3]")
	private WebElement timesheet;
	
	@FindBy (xpath="//input[@class='inputFormatHint ac_input']")
	private WebElement Employee;
	
	@FindBy (xpath="(//input[@type='button'])[4]")
	private WebElement search;
	
	public Timesheet(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clicktimesheet() 
	{
		timesheet.click();
	}
	public void enteremployee() 
	{
		Employee.sendKeys("Charlie Carter");
	}
	public void clicksearch() 
	{
		search.click();
	}
	
	
	
	
	
}
	

