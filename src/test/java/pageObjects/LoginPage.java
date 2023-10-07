package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	private By login = By.linkText("Log In");
	private By userName=By.id("id_user");
	private By next=By.xpath("//button[text()='Next']");
	private By password=By.id("id_password");
	private By signIn=By.xpath("//button[text()='Sign in']");
	
	
	
	public void login() throws InterruptedException
	{
		driver.findElement(login).click();
		driver.findElement(userName).sendKeys("prustybinodkumar95@gmail.com");
		driver.findElement(next).click();
		Thread.sleep(1000);
		driver.findElement(password).sendKeys("Binod@1995");
		driver.findElement(signIn).click();
	}

	
}