package stepdefinations;


import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	
	public TestContextSetup testContextSetup;
	public Hooks(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	@After
	public void afterScenario() throws IOException
	{
		testContextSetup.testBase.webDriverManager().quit();
	}
	@AfterStep
	public void ScreenShot(Scenario scenario) throws IOException
	{
		WebDriver driver=testContextSetup.testBase.webDriverManager();
		if(scenario.isFailed())
		{
		TakesScreenshot ts = (TakesScreenshot)driver;
		byte[] content = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(content, "image/png", "image");
		}
		
	}
}
