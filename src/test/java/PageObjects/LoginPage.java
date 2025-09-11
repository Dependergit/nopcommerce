package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	WebDriver ldriver;

    public LoginPage(WebDriver rdriver) 
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
	
    @FindBy( xpath = "//input[@id='Email']")
    WebElement Logininput;
    
    @FindBy(xpath = "//input[@id='Password']")
    WebElement Passwordinput;
    
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement Loginbutton;
	
    @FindBy(xpath = "//li[@class = \"nav-item\"]/child::a[text()= \"Logout\"]")
    WebElement Logoutbutton;
    
    @FindBy(xpath = "//title[normalize-space()='Dashboard / nopCommerce administration']")
    WebElement adminpagetitle;
    
    @FindBy(xpath = "//title[normalize-space()='nopCommerce demo store. Login']")
    WebElement loginpagetitle;
    
   
    public void enterusername(String uname) throws InterruptedException
    {
    	Thread.sleep(3000);
    	Logininput.clear();
    	Logininput.sendKeys(uname);
    }
    
    public void enterpassowrd(String pass) throws InterruptedException
    {
    	Thread.sleep(3000);
    	Passwordinput.clear();
    	Passwordinput.sendKeys(pass);
    }
    
    
    public void clicklogin() throws InterruptedException 
    {
    	Thread.sleep(3000);
    	Loginbutton.click();
    }
    
    public String loginpagetitle() throws InterruptedException
    {
    	Thread.sleep(3000);
    	//return adminpagetitle.getText();
    	return ldriver.getTitle();
    }
    
    public String adminpagetitle() throws InterruptedException
    {
    	Thread.sleep(3000);
    	//return adminpagetitle.getText();
    	return ldriver.getTitle();
    }
    
    public void clicklogout() throws InterruptedException 
    {
    	Thread.sleep(3000);
    	// WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
    	  //  wait.until(ExpectedConditions.elementToBeClickable(Logoutbutton));
    	    Logoutbutton.click();
    	//Logoutbutton.click();
    }
	
  
}
