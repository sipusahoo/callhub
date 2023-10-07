package stepdefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DashboardPage;
import utils.TestContextSetup;

public class DashboardPageStepDefination {

	TestContextSetup testContextSetup;
	DashboardPage dashboardPage;
	
	public DashboardPageStepDefination(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		 this.dashboardPage=testContextSetup.pageObjectManager.getDashboardPage();
	}
	
	@When("the user click on Create Campaign button")
	public void the_user_click_on_create_campaign_button() throws InterruptedException {
		assertEquals(dashboardPage.verifyDashboardPage(), "Dashboard", "Dashboard page not displayed");
		dashboardPage.getCampaign();
		Thread.sleep(1000);
	}

	@When("the user select voice broadcasting")
	public void the_user_select_voice_broadcasting() {
		dashboardPage.selectVoiceBroadcasting();
	}

	@When("user click next button")
	public void user_click_next_button() throws InterruptedException {
		dashboardPage.getNextToNewCampaign();
	}

	@Then("user should land on New Voice Broadcast Campaign")
	public void user_should_land_on_new_voice_broadcast_campaign() {
		assertTrue(dashboardPage.verifynewVoiceBroadcast(), "new voice broadcast campaign not showing");
	}

	@When("user select live Answer")
	public void user_select_live_answer() throws InterruptedException {
		dashboardPage.chooseLiveAnswer();
		Thread.sleep(2000);
	}

	@When("User Select transfer option")
	public void user_select_transfer_option() throws InterruptedException {
		dashboardPage.addTransfer();
	}

	@When("user select Do Not Call option")
	public void user_select_do_not_call_option() {
		dashboardPage.addDNC();
	}

	@When("Click On next button")
	public void click_on_next_button() {
		dashboardPage.clickNextToAddContactList();
	}

	@Then("user should land on contacts option")
	public void user_should_land_on_contacts_option() {
		assertTrue(dashboardPage.verifyContactTab(), "Contacts tab not displayed");
	}

	@When("user select a contact list")
	public void user_select_a_contact_list() {
		dashboardPage.selectContactList();
	}

	@When("user click on next button")
	public void user_click_on_next_button() throws InterruptedException {
		dashboardPage.clickNextToGeneralSettings();
	}

	@Then("user should land on general Settings page")
	public void user_should_land_on_general_settings_page() {
		assertTrue(dashboardPage.verifyGeneralSettingsTab(), "General settings tab not displayed");
	}

	@When("the user click on next button on")
	public void the_user_click_on_next_button_on() throws InterruptedException {
		dashboardPage.clickToNextSchedule();
		Thread.sleep(2000);
	}
	
	@Then("user should land on Schedule Campaign page")
	public void user_should_land_on_schedule_campaign_page() {
		assertTrue(dashboardPage.verifyScheduleTab(), "Schedule tab not displayed");
	}

	@When("Click on Finish button")
	public void click_on_finish_button() throws InterruptedException {
		dashboardPage.finishCampaign();
		Thread.sleep(3000);
	}

	@Then("user should see successfully alert message match with campaign name.")
	public void user_should_see_successfully_alert_message_match_with_campaign_name() {
		assertTrue(dashboardPage.verifySuccessAlertMessage(), "Campaign not Created Successfully");
	}
}
