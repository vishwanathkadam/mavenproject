package POM_ClassHRMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myleave 
{
    @FindBy(xpath="(//div[@class='quickLaunge'])[5]")
    private WebElement myleave;
    
    @FindBy (xpath="//input[@id='calFromDate']")
    private WebElement fromdate;
    
    @FindBy (xpath="//input[@id='calToDate']")
    private WebElement todate;
    
    @FindBy (xpath="(//input[@name='leaveList[chkSearchFilter][]'])[3]")
    private WebElement select;
    
    @FindBy (xpath="//input[@name='btnSearch']")
    private WebElement search;
    
    
    public Myleave(WebDriver driver) 
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void  clickmyleave() 
    {
    	myleave.click();
    }
    public void selectfromdate() 
    {
    	fromdate.sendKeys("2020-05-06");
    }
    public void selecttodate() 
    {
    	todate.sendKeys("2021-05-06");
    }
    public void clickselect() 
    {
    	select.click();
    }
    public void clicksearch() 
    {
    	search.click();
    }
    
    
    
    
    
}
