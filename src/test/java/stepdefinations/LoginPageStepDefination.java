package stepdefinations;

import io.cucumber.java.en.Given;
import pageObjects.LoginPage;
import utils.TestContextSetup;


public class LoginPageStepDefination {
	
	TestContextSetup testContextSetup;
	LoginPage loginPage;
	
	public LoginPageStepDefination(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		 this.loginPage=testContextSetup.pageObjectManager.getLoginPage();
	}
	
	@Given("the user is on dashbboard page")
	public void the_user_is_on_dashbboard_page() throws InterruptedException {
		loginPage.login();	   
	}

}
