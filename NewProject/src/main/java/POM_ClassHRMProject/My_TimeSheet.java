package POM_ClassHRMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class My_TimeSheet 
{
	
	@FindBy (xpath="(//div[@class='quickLaunge'])[6]")
	private WebElement clicktimesheet;
	
  @FindBy (xpath="//select[@id='startDates']")
  private WebElement dateselect;
  
  
  
  
  public My_TimeSheet(WebDriver driver) 
  {
	  PageFactory.initElements(driver,this);
  }
  
  public void clickmytimesheet() 
  {
	  clicktimesheet.click();
  }
  
  public void droupdate() 
  {
	  Select k=new Select(dateselect);
	  k.selectByVisibleText("2022-05-02 to 2022-05-08");
  }
}


