package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pojo 
{
	public WebDriver LaunchBrowser() 
	   {
		   System.setProperty("webdriver.chrome.driver","D:\\Testing\\Selenium files\\updated exe 100\\chromedriver_win32\\chromedriver.exe");
		      
			WebDriver driver=new ChromeDriver();
			
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			
			driver.manage().window().maximize();
			return driver;
	   }
}
