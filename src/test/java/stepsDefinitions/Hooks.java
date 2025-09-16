package stepsDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends Base{

    @Before
    public void setup1() {
       
        setup();
    }

    @After
    public void tearDown(Scenario scenario) 
    {
        // Agar scenario fail hua to screenshot attach hoga report me
        if (scenario.isFailed()) 
        {
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed Step Screenshot");
        }

        teardown();
    }
}

