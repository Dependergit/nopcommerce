package stepsDefinitions;

import java.util.Arrays;

import org.junit.Assert;

import PageObjects.OrderPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps extends Base {
	
	OrderPage order = new OrderPage(driver);
	

	@Given("user launchh the browser")
	public void user_launchh_the_browser() 
	{
	   // Browser is getting launched by the Hooks class @Before Method 
	}

	@When("user opens thee URL")
	public void user_opens_thee_url() 
	{
	   driver.get(url);
	}

	@When("user enter the validd username {string} and password {string}")
	public void user_enter_the_validd_username_and_password(String uname, String pass) throws InterruptedException 
	{
	  order.enterusername(uname);
	  order.enterpassowrd(pass);
	}

	@When("user click on the login buttons")
	public void user_click_on_the_login_buttons() throws InterruptedException
	{
		order.clicklogin();
	}
	
	//Order details checking
	
	@When("user click on the sales dropdown button then Orders button")
	public void user_click_on_the_sales_dropdown_button_then_orders_button() throws InterruptedException 
	{
	   order.clickonSalesdropdown();
	   order.clickonorder();
	  
	}
	@Then("user should see the Brenda Lindgren order details {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void user_should_see_the_brenda_lindgren_order_details_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) throws InterruptedException {
		 String[] values = {string, string2, string3, string4, string5, string6, string7,string8, string9};
		Boolean flag = false;
			String[][] array2 = order.fetchingWebTableContent();
			for(int i = 0; i < order.rowsize; i++ )
			{
				for(int j = 0; j<order.cellsize; j++)
				{
					if(array2[i][j].equals("Brenda Lindgren brenda_lindgren@nopCommerce.com"))
					{
						flag = true;
						System.out.println("brenda is present in the web table");
							break;
						}
						
					}
					if(flag.equals(true))
					{
						break;
					}
				}
			
				
			
			
			
			

	}
	
		
	}

	
	
