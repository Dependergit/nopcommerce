package stepsDefinitions;

import org.junit.Assert;

import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps2 extends Base{
	
	LoginPage lpg = new LoginPage(driver);
	
	@Given("user launch the browser")
	public void user_launch_the_browser() 
	{
	   // Browser is getting launched by the Hooks class @Before Method 
	}

	@When("user opens the URL")
	public void user_opens_the_url() 
	{
	   driver.get(url);
	}

	@When("user enter the valid username {string} and password {string}")
	public void user_enter_the_valid_username_and_password(String uname, String pass) 
	{
	  try {
		lpg.enterusername(uname);
	  } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	  try {
		lpg.enterpassowrd(pass);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@When("user click on the login button")
	public void user_click_on_the_login_button()
	{
		try {
			lpg.clicklogin();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("admin page title should be {string}")
	public void admin_page_title_should_be(String adminpgtitle) throws InterruptedException 
	{
	   if(lpg.adminpagetitle().equals(driver.getTitle()))
	   {
		   Assert.assertTrue(true);
	   }
	}

	@When("user click on the logoutbutton")
	public void user_click_on_the_logoutbutton() throws InterruptedException 
	{
		lpg.clicklogout();
	}

	@Then("logout page title should be {string}")
	public void logout_page_title_should_be(String logoutpgtitle) throws InterruptedException
	{
		 if(lpg.loginpagetitle().equals(driver.getTitle()))
		   {
			   Assert.assertTrue(true);
		   }
	}

	@Then("close browser")
	public void close_browser() 
	{
	   // From the Hooks class @After hook this method will run automatically
	}

	// invalid credentials
	@When("user enter the invalid username {string} and invalid password {string}")
	public void user_enter_the_invalid_username_and_invalid_password(String invaliduname, String invlaidpass) throws InterruptedException
	{
	   lpg.enterusername(invaliduname);
	   lpg.enterpassowrd(invlaidpass);
	}

	@Then("error text should be dispalyed {string}")
	public void error_text_should_be_dispalyed(String errortext)
	{
	   if(lpg.errortext().equals(errortext))
	   {
		   Assert.assertTrue(true);
	   }
	}

	// For GUI level test steps
	@Then("username field should be displayed")
	public void username_field_should_be_displayed() 
	{
		if(lpg.usernamefielddisplayed())
		{
			Assert.assertTrue(true);
		}
	}

	@Then("password filed should be dispalyed")
	public void password_filed_should_be_dispalyed()
	{
	   if(lpg.passwordfielddisplayed())
	   {
		   Assert.assertTrue(true);
	   }
		   
	}

	@Then("login button should be displayed")
	public void login_button_should_be_displayed() 
	{
	    if(lpg.loginbuttondispalyed())
	    {
	    	Assert.assertTrue(true);
	    }
	}

	@Then("remeber me checkbox should be displayed")
	public void remeber_me_checkbox_should_be_displayed() 
	{
		if(lpg.checkboxdispalyed())
	    {
	    	Assert.assertTrue(true);
	    }
	}





}
