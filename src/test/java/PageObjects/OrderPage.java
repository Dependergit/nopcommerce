package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	
	WebDriver ldriver;
	public int  rowsize;
	public int  cellsize;
	
	public OrderPage(WebDriver rdriver)
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
	    
	    @FindBy(xpath = "//p[normalize-space()='Sales']")
	    WebElement Salesdropdown;
	    
	    @FindBy(xpath = "//a[@class='nav-link']//p[contains(text(),'Orders')]")
	    WebElement Orderdetails;
	    
	   @FindBy(xpath = "//div[@class='dt-scroll-headInner']//tr/th")
	   List<WebElement> totalcell;

	   
	   @FindBy(xpath = "//tbody/tr")
	   List<WebElement> totalrow;
	   
	   
	 
	   
	   //Action method for handle table
	   public String[][] fetchingWebTableContent() throws InterruptedException
	   {
		  Thread.sleep(4000);
		  cellsize = totalcell.size();
		  rowsize = totalrow.size();
		   
	//	  int cellsize = ldriver.findElements(By.xpath("//div[@class='dt-scroll-headInner']//tr/th")).size();
		//   int rowsize = ldriver.findElements(By.xpath ( "//tbody/tr")).size();
		  System.out.println("Fetching Complete wevb table records");
		   System.out.println("Size of cell " +  cellsize + " Size of row " + rowsize);
		   
		   String[][] localarray = new String[rowsize][cellsize];
		   
		   for(int i = 1; i<=rowsize; i ++)
		   {
			   for(int j = 1; j<= cellsize;  j ++)
			   {
				   String name = ldriver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + j + "]")).getText();
				   				 String name2 = name.replaceAll("\\s+", " ");
				   				localarray[i-1][j-1] = name2;
				   				
				   System.out.println(localarray[i-1][j-1]);
				  
				   
			   }
		   }
		   
		   return localarray;
		   
	   }
	    
	  
	   
	   
	  
	    //Actions methods
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
	    
	    public void clickonSalesdropdown() throws InterruptedException
	    {
	    	Thread.sleep(3000);
	    	Salesdropdown.click();
	    }
	    
	    public void clickonorder() throws InterruptedException
	    {
	    	Thread.sleep(3000);
	    	Orderdetails.click();
	    }
}
