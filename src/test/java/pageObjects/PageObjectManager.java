package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPage loginPage;
	public DashboardPage dashboardPage;
	
	public LoginPage getLoginPage()
	{
		loginPage=new LoginPage(driver);
		return loginPage;
	}
	
	public DashboardPage getDashboardPage()
	{
		dashboardPage=new DashboardPage(driver);
		return dashboardPage;
	}
}
