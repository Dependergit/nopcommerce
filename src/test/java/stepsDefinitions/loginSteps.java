package stepsDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginSteps {

	WebDriver driver;
	LoginPage lp;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		lp= new LoginPage(driver);
		
	}

	@When("user opens URL")
	public void user_opens_url()
	{
	   driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	@When("User enter valid credentails email {string} and password {string}")
	public void user_enter_valid_credentails_email_and_password(String uname, String pass) 
	{
	   try {
		lp.enterusername(uname);
	   } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
	   
	   try {
		lp.enterpassowrd(pass);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@When("User click on loginbutton")
	public void user_click_on_loginbutton() 
	{
	   try {
		lp.clicklogin();
	   } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
	}

	@Then("Admin title should be displayed {string}")
	public void admin_title_should_be_displayed(String expectedtitle) throws InterruptedException 
	{
	   String currenttitle =  lp.adminpagetitle();
	   Assert.assertEquals(currenttitle, expectedtitle);
	}

	@When("User click on logout button")
	public void user_click_on_logout_button() throws InterruptedException 
	{
	    lp.clicklogout();
	}

	@Then("Login page title should displayed {string}")
	public void login_page_title_should_displayed(String logintitle) throws InterruptedException 
	{
		  Assert.assertEquals(lp.loginpagetitle(), logintitle);

	}

	@Then("Close browser")
	public void close_browser()
	{
	   driver.close();
	   driver.quit();
	}
	
	// invalid credentials
	@When("User enter invalid credentails email {string} and password {string}")
	public void user_enter_invalid_credentails_email_and_password(String invalidusername, String invalidpassowrd) throws InterruptedException 
	{
		lp.enterusername(invalidusername);
		lp.enterpassowrd(invalidpassowrd);
	}
	
	@When("User enter valid credentials email {string} and password {string}")
	public void user_enter_valid_credentials_email_and_password(String username, String password) throws InterruptedException 
	{
	   lp.enterusername(username);
	   lp.enterpassowrd(password);
	}

}
