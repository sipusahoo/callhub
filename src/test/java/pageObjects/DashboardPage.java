package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DashboardPage {
	
	public WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	
	private By dashboard=By.xpath("//div[@class='span12 tablet-padding-left']/h1");
	private By createCampaignButton=By.linkText("Create Campaign");
	private By campaignTypeDropdown=By.id("campaignType");
	private By next1=By.linkText("Next");
	private By newVoiceBroadcast=By.xpath("(//h2[normalize-space(text()='New Voice Broadcast Campaign')])[1]");
	private By typeToSearch=By.xpath("(//span[text()='Type to Search'])[2]");
	private By sampleAudio=By.xpath("//li[text()='sample-audio-voice-broadcast']");
	private By addTransferOPtion=By.id("add-multi-transfer");
	private By convertTexttoSpeechTransfer=By.xpath("//label[@id='vb-transfer-tts-label']");
	private By transferTextArea=By.xpath("//label[@id='vb-transfer-tts-label']/..//textarea");
	private By hangup=By.xpath("(//input[@value='hangup']/..)[1]");
	private By addTransfer=By.linkText("Add transfer");
	private By addDNC=By.id("enable-dnc");
	private By convertTexttoSpeechDNC=By.xpath("//label[@id='vb-dnc-tts-label']");
	private By dncTextArea=By.xpath("//label[@id='vb-dnc-tts-label']/..//textarea");
	private By next2=By.xpath("//button[text()='Next']");
	private By contactLists=By.xpath("//div[text()='Contact lists']");
	private By selectContact=By.xpath("//input[@class='select2-search__field']/..");
	private By sampleContact=By.xpath("//li[text()='Sample voice broadcasting contact list']");
	private By next3=By.xpath("//button[text()='Next']");
	private By generalSettings=By.xpath("//div[text()='General Settings']");
	private By next4=By.xpath("//button[text()='Next']");
	private By setDateAndTime=By.xpath("//div[text()='Set date and time to schedule your campaign']");
	private By finish=By.xpath("//button[text()='Finish']");
	private By alertMessage=By.xpath("//div[contains(@class,'alert-success custom-notification')]");
	
	public String verifyDashboardPage() {
		return driver.findElement(dashboard).getText();
	}

	public void getCampaign()
	{
		driver.findElement(createCampaignButton).click();
	}
	
	public void selectVoiceBroadcasting()
	{
		WebElement campaignDropdown = driver.findElement(campaignTypeDropdown);
		Select sel=new Select(campaignDropdown);
		sel.selectByVisibleText("Voice Broadcasting");
	}
	
	public void getNextToNewCampaign() throws InterruptedException
	{
		driver.findElement(next1).click();
		Thread.sleep(1000);
	}
	
	public Boolean verifynewVoiceBroadcast()
	{
		return driver.findElement(newVoiceBroadcast).isDisplayed();
	}
	
	public void chooseLiveAnswer()
	{
		driver.findElement(typeToSearch).click();
		driver.findElement(sampleAudio).click();
	}
	public void addTransfer() throws InterruptedException
	{
		driver.findElement(addTransferOPtion).click();
		Thread.sleep(1000);
		driver.findElement(convertTexttoSpeechTransfer).click();
		driver.findElement(transferTextArea).sendKeys("Please hold while we transfer your call.");
		driver.findElement(hangup).click();
		driver.findElement(addTransfer).click();
		Thread.sleep(2000);
	}
	
	public void addDNC()
	{
		driver.findElement(addDNC).click();
		driver.findElement(convertTexttoSpeechDNC).click();
		driver.findElement(dncTextArea).sendKeys("Thank you, your number will be removed from our list.");
	}
	
	
	public void clickNextToAddContactList()
	{
		driver.findElement(next2).click();
	}
	
	public Boolean verifyContactTab()
	{
		return driver.findElement(contactLists).isDisplayed();
	}
	
	public void selectContactList()
	{
		driver.findElement(selectContact).click();
		driver.findElement(sampleContact).click();
	}
	public void clickNextToGeneralSettings() throws InterruptedException
	{
		driver.findElement(next3).click();
		Thread.sleep(1000);
	}
	
	public Boolean verifyGeneralSettingsTab()
	{
		return driver.findElement(generalSettings).isDisplayed();
	}
	
	public void clickToNextSchedule()
	{
		driver.findElement(next4).click();
	}
	
	public Boolean verifyScheduleTab()
	{
		return driver.findElement(setDateAndTime).isDisplayed();
	}
	
	public void finishCampaign()
	{
		driver.findElement(finish).click();
	}
	
	public Boolean verifySuccessAlertMessage()
	{
		return driver.findElement(alertMessage).isDisplayed();
	}
}
