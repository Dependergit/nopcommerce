package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features = "C:\\Users\\LENOVO PC\\eclipseworkspace\\nopcommerce\\resources\\Features\\Order.feature",
	//"src/test/resources/Features/Login.feature",
	//"C:\\Users\\LENOVO PC\\eclipseworkspace\\CucumberProject1\\src\\test\\resources\\Features\\Login.feature",	
		glue = "stepsDefinitions",
			//	tags = "@RunThis",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","summary","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "html:target/cucumber-html-report","json:target/cucumber.json",
                "junit:target/cucumber.xml"}
		
		
)

public class TestRun extends AbstractTestNGCucumberTests 
	{
	
	}





