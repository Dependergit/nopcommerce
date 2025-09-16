package stepsDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilites.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	ReadConfig rc = new ReadConfig();
	public String url = rc.geturl();
	public String browser = rc.getbrowser();
	
	public void setup()
	{
		if(browser.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		
	}
	
	public void teardown()
	{
		driver.close();
		driver.quit();
		
	}

}
